package tech.justjava.zam.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import tech.justjava.zam.keycloak.KeycloakService;

@Component
@RequiredArgsConstructor
public class StartupRunner implements ApplicationRunner {
    private final KeycloakService keycloakService;

    @Override
    public void run(ApplicationArguments args) {
        keycloakService.syncKeycloak();
    }
}
