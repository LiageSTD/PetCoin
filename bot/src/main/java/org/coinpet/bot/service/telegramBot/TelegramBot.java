package org.coinpet.bot.service.telegramBot;

import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserNotificationDTO;
import org.coinpet.dto.puller.NotificationDTO;

import java.util.List;

public interface TelegramBot {
    void notifyUser(UserNotificationDTO subscriptionDTO);

    default void notifyManyUsers(List<UserNotificationDTO> subscriptionDTOList) {
        for (UserNotificationDTO subscriptionDTO : subscriptionDTOList) {
            notifyUser(subscriptionDTO);
        }
    }
}
