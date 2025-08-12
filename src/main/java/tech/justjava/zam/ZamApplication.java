package tech.justjava.zam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ZamApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ZamApplication.class, args);
    }

}
