package org.coinpet.petcoin.config;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;


@Getter
@Setter
@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
public class ApplicationConfig {
    private Integer webClientMaxInMemorySize;
    private Scheduler scheduler;
    private Boolean schedulerEnabled;
    private Kconfig kconfig;
    @Bean
    private Scheduler scheduler() {
        return scheduler;
    }
    @Bean
    private Kconfig kconfig() {
        return kconfig;
    }

    public Duration getUpdateInterval() {
        return scheduler.interval;
    }

    public record Scheduler(boolean enabled, @NotNull Duration interval) {
    }

    public record Kconfig(String url, String group){}
}

