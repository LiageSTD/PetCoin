package org.coinpet.bot.service.botService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.bot.clients.UserClient;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class SimpleBotService implements BotService {

    UserClient userClient;

    @Override
    public void registerUser(UserDTO userDTO) {
        userClient.registerUser(userDTO);
    }

    @Override
    public void unregisterChat(Long telegramID) {
        userClient.unregisterUser(telegramID);
    }

    @Override
    public boolean isCharRegistered(Long telegramID) {
        return userClient.checkIfUserIsRegistered(telegramID);
    }

    @Override
    public void subscribeToCurrency(SubscriptionDTO subscriptionDTO) {
        userClient.subscribeUser(subscriptionDTO);
    }

    @Override
    public void unsubscribeFromCurrency(SubscriptionDTO subscriptionDTO) {
        userClient.unSubscribeUser(subscriptionDTO);
    }

    @Override
    public List<SubscriptionDTO> getSubscriptions(Long telegramID) {
        return userClient.getUserSubscriptions(telegramID);
    }
}
