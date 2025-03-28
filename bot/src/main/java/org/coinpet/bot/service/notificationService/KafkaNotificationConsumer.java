package org.coinpet.bot.service.notificationService;

import lombok.AllArgsConstructor;
import org.coinpet.bot.service.botService.BotService;
import org.coinpet.dto.bot.UserNotificationDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaNotificationConsumer {
    private final BotService botService;

    @KafkaListener(topics="user-notify")
    public void consumeNotification(UserNotificationDTO notification) {
        botService.notifyUser(notification);
    }

}
