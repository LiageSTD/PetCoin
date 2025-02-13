package org.coinpet.petcoin.repository;

import org.coinpet.petcoin.repository.dto.SubscriptionDTO;
import org.coinpet.petcoin.repository.dto.UserDTO;

import java.util.List;

public interface UserRepository {

    Integer addUser(UserDTO user);

    void updateUser(UserDTO user);

    void deleteUserById(Long id);

    UserDTO findUserById(Long id);

    Boolean subscribeUser(SubscriptionDTO subscriptionDTO);

    void unsubscribeUser(SubscriptionDTO subscriptionDTO);

    List<SubscriptionDTO> getUserSubscriptions(Long id);

    List<UserDTO> getAllUsers();

    Integer getUserIdByTelegramId(Long telegramId);
}
