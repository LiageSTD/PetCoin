package org.coinpet.dto.bot;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class UserNotificationDTO implements Serializable {
    @NotEmpty
    long userTelegramID;
    @NotNull
    String coinNameToNotifyAbout;

    BigDecimal currentValue;

    NotificationType notificationType;
}
