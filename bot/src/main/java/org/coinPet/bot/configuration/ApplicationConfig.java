package org.coinPet.bot.configuration;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
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
}
