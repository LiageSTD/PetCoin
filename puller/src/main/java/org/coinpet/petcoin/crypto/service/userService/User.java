package org.coinpet.petcoin.crypto.service.userService;

import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;

import java.util.List;

public interface User {
    void addUser(UserDTO user);

    void deleteUser(Long telegramId);

    boolean subscribeUser(SubscriptionDTO subscriptionDTO);

    void unsubscribeUser(SubscriptionDTO subscriptionDTO);

    List<SubscriptionDTO> getUserSubscriptions(Long id);

    boolean findUserById(Long telegramId);
}
