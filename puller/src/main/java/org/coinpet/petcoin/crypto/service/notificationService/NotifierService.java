package org.coinpet.petcoin.crypto.service.notificationService;

import lombok.AllArgsConstructor;
import org.coinpet.dto.bot.UserNotificationDTO;
import org.coinpet.petcoin.crypto.repository.UserRepository;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@EnableScheduling
public class NotifierService implements Notifier {
    UserRepository userRepository;
    KafkaNotificationProducer kafkaNotificationSender;
    @Override
    public void getAllUsersToNotify() {
        List<UserNotificationDTO> usersToNotify =  userRepository.getUsersToNotify();
        for (UserNotificationDTO userNotification : usersToNotify) {
            userRepository.updateUserNotificationRequest(userNotification);
        }
        kafkaNotificationSender.sendMessages(usersToNotify);
    }

}
