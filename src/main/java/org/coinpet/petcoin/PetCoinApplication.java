package org.coinpet.petcoin;

import org.coinpet.petcoin.config.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfig.class)
public class PetCoinApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetCoinApplication.class, args);
    }

}
