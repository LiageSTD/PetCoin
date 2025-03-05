package org.coinpet.petcoin.crypto.service.notificationService;

import org.coinpet.dto.bot.UserNotificationDTO;

import java.util.List;

public interface Notifier {
    List<UserNotificationDTO> getAllUsersToNotify();
}
