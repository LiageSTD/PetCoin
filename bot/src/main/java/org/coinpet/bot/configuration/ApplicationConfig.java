package org.coinpet.bot.configuration;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
@Getter
@Setter
public class ApplicationConfig {
    @NotEmpty
    String telegramBotToken;
    @NotEmpty
    String telegramBotName;
    Kafka kafka;

    public record Kafka(@NotEmpty String bootstrapServers, @NotEmpty String groupId) {}
    @Bean
    public Kafka getKafka() {
        return kafka;
    }
}
