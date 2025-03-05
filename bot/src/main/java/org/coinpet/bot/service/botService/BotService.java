package org.coinpet.bot.service.botService;

import jakarta.validation.constraints.NotNull;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;

import java.util.List;

public interface BotService {
    void registerUser(UserDTO userDTO);

    void unregisterChat(@NotNull Long telegramID);

    boolean isCharRegistered(@NotNull Long telegramID);

    void subscribeToCurrency(SubscriptionDTO subscriptionDTO);

    void unsubscribeFromCurrency(SubscriptionDTO subscriptionDTO);

    List<SubscriptionDTO> getSubscriptions(@NotNull Long telegramID);
}
