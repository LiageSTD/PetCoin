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

    @Bean
    private Scheduler scheduler() {
        return scheduler;
    }

    public Duration getUpdateInterval() {
        return scheduler.interval;
    }

    public record Scheduler(boolean enabled, @NotNull Duration interval) {
    }
}

