package org.coinpet.petcoin.crypto.service.userService;

import lombok.AllArgsConstructor;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaUserSubscriptionConsumer {
    private final UserService userService;

    @KafkaListener(topics="user-subscriptions", groupId = "puller", containerFactory = "kafkaUserUnsubscribeListenerContainerFactory")
    public void consumeUserSubscription(SubscriptionDTO subscriptionDTO) {
        userService.consumeSubscription(subscriptionDTO);
    }
}
