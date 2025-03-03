package org.coinPet.bot.service.botService;

import jakarta.validation.constraints.NotNull;
import org.coinPet.dto.bot.SubscriptionDTO;
import org.coinPet.dto.bot.UserDTO;

import java.util.List;

public interface BotService {
    void registerUser(UserDTO userDTO);

    void unregisterChat(@NotNull Long telegramID);

    boolean isCharRegistered(@NotNull Long telegramID);

    void subscribeToCurrency(SubscriptionDTO subscriptionDTO);

    void unsubscribeFromCurrency(SubscriptionDTO subscriptionDTO);

    List<SubscriptionDTO> getSubscriptions(@NotNull Long telegramID);
}
