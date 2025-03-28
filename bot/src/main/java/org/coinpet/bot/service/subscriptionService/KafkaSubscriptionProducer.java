package org.coinpet.bot.service.subscriptionService;

import lombok.AllArgsConstructor;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class KafkaSubscriptionProducer {
    private static final String TOPIC = "user-subscriptions";

    private final KafkaTemplate<String, SubscriptionDTO> kafkaTemplate;

    public void send(SubscriptionDTO notificationDTO) {
        kafkaTemplate.send(TOPIC, notificationDTO);
    }



    public void sendMessages(List<SubscriptionDTO> notificationDTOS) {
        for (SubscriptionDTO singleNotification : notificationDTOS) {
            send(singleNotification);
        }
    }

}