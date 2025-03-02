package org.coinpet.petcoin.crypto.service.userService;

import org.coinpet.petcoin.crypto.repository.dto.SubscriptionDTO;
import org.coinpet.petcoin.crypto.repository.dto.UserDTO;

import java.util.List;

public interface User {
    void addUser(UserDTO user);

    void deleteUser(Long telegramId);

    void subscribeUser(SubscriptionDTO subscriptionDTO);

    void unsubscribeUser(SubscriptionDTO subscriptionDTO);

    List<SubscriptionDTO> getUserSubscriptions(Long id);

    boolean findUserById(Long telegramId);
}
