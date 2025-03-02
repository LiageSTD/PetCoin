package org.coinpet.petcoin;

import org.coinpet.petcoin.config.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfig.class)
@EnableScheduling
public class PetCoinApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetCoinApplication.class, args);
    }

}
