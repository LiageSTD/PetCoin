package org.coinPet.dto.bot;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserNotificationDTO {
    @NotEmpty
    long userTelegramID;
    @NotNull
    String coinNameToNotifyAbout;
    @NotNull
    String message;
}
