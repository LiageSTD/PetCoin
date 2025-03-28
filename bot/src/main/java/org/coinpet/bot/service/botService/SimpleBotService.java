package org.coinpet.bot.service.botService;

import lombok.AllArgsConstructor;
import org.coinpet.bot.clients.UserClient;
import org.coinpet.bot.service.subscriptionService.KafkaSubscriptionProducer;
import org.coinpet.bot.service.telegramBot.TelegramBot;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;
import org.coinpet.dto.bot.UserNotificationDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SimpleBotService implements BotService {

    private final UserClient userClient;

    private final TelegramBot telegramBot;

    private final KafkaSubscriptionProducer subscriptionService;

    @Override
    public void registerUser(UserDTO userDTO) {
        userClient.registerUser(userDTO);
    }

    @Override
    public void unregisterUser(Long telegramID) {
        userClient.unregisterUser(telegramID);
    }

    @Override
    public boolean isCharRegistered(Long telegramID) {
        return userClient.checkIfUserIsRegistered(telegramID);
    }

    @Override
    public void subscribeToCurrency(SubscriptionDTO subscriptionDTO) {
        subscriptionService.send(subscriptionDTO);
    }

    @Override
    public void unsubscribeFromCurrency(SubscriptionDTO subscriptionDTO) {
        subscriptionService.send(subscriptionDTO);
    }

    @Override
    public List<SubscriptionDTO> getSubscriptions(Long telegramID) {
        return userClient.getUserSubscriptions(telegramID);
    }

    @Override
    public void notifyUser(UserNotificationDTO userNotificationDTO) {
        telegramBot.notifyUser(userNotificationDTO);
    }
}
