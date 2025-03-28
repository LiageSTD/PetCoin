package org.coinpet.bot.service.botService;

import jakarta.validation.constraints.NotNull;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;
import org.coinpet.dto.bot.UserNotificationDTO;

import java.util.List;

public interface BotService {
    void registerUser(UserDTO userDTO);

    void unregisterUser(@NotNull Long telegramID);

    boolean isCharRegistered(@NotNull Long telegramID);

    void subscribeToCurrency(SubscriptionDTO subscriptionDTO);

    void unsubscribeFromCurrency(SubscriptionDTO subscriptionDTO);

    List<SubscriptionDTO> getSubscriptions(@NotNull Long telegramID);

    void notifyUser(@NotNull UserNotificationDTO userNotificationDTO);

    default void notifyAllUsers(@NotNull List<UserNotificationDTO> userNotificationDTOS) {
        for (UserNotificationDTO userNotificationDTO : userNotificationDTOS) {
            notifyUser(userNotificationDTO);
        }
    }
}
