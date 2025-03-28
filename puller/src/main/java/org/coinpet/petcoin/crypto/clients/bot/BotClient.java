package org.coinpet.petcoin.crypto.clients.bot;

import org.coinpet.dto.bot.UserNotificationDTO;
import org.coinpet.dto.puller.NotificationDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface BotClient {
    @PostExchange("bot/notifications/{userTelegramID}")
    public void notifyUser(@PathVariable Long userTelegramID, @RequestBody NotificationDTO notificationDTO);
    @PostExchange("bot/notifications")
    public void notifyUsers(List<UserNotificationDTO> usersToNotify);
}
