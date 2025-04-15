package org.coinpet.dto.bot;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

@Data
public class UserNotificationDTO implements Serializable {
    @NotEmpty
    long userTelegramID;
    // Actually it's a coin symbol. Sorry :)
    // TODO: Change property name to coin symbol
    // Just to make a commit
    @NotNull
    String coinNameToNotifyAbout;

    BigDecimal currentValue;

    NotificationType notificationType;
}
