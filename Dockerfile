# Step 1: Use a Maven image to build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom.xml and download dependencies first (cache layer)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source code and build the JAR
COPY src ./src
RUN mvn clean package -DskipTests

# Step 2: Use a smaller JDK image to run the application
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Environment variables (configure DB, etc.)
ENV SPRING_PROFILES_ACTIVE=prod
ENV JAVA_OPTS=""

# Expose application port
EXPOSE 9002

# Run the application
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
