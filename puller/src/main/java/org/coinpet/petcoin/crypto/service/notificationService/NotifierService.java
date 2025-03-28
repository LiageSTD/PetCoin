package org.coinpet.petcoin.crypto.service.notificationService;

import lombok.AllArgsConstructor;
import org.coinpet.dto.bot.UserNotificationDTO;
import org.coinpet.petcoin.crypto.clients.bot.BotClient;
import org.coinpet.petcoin.crypto.repository.CoinRepository;
import org.coinpet.petcoin.crypto.repository.UserRepository;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@EnableScheduling
public class NotifierService implements Notifier {
    UserRepository userService;
    KafkaNotificationProducer kafkaNotificationSender;
    @Override
    public void getAllUsersToNotify() {
        List<UserNotificationDTO> usersToNotify =  userService.getUsersToNotify();
        kafkaNotificationSender.sendMessages(usersToNotify);
    }
}
