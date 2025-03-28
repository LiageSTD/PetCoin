package org.coinpet.petcoin.crypto.service.notificationService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.dto.bot.UserNotificationDTO;
import org.coinpet.dto.puller.NotificationDTO;
import org.coinpet.petcoin.crypto.service.userService.User;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class KafkaNotificationProducer {
    private static final String TOPIC = "user-notify";

    private final KafkaTemplate<String, UserNotificationDTO> kafkaTemplate;

    public void sendMessage(UserNotificationDTO notificationDTO) {
        kafkaTemplate.send(TOPIC, notificationDTO);
        log.info("Notification send {}", notificationDTO);
    }

    public void sendMessages(List<UserNotificationDTO> notificationDTOS) {
        for (UserNotificationDTO singleNotification : notificationDTOS) {
            sendMessage(singleNotification);
        }
    }

}


