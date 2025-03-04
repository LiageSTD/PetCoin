package org.coinPet.dto.bot;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserNotificationDTO implements Serializable {
    @NotEmpty
    long userTelegramID;
    @NotNull
    String coinNameToNotifyAbout;
    @NotNull
    String message;
}
