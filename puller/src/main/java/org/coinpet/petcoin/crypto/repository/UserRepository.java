package org.coinpet.petcoin.crypto.repository;

import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;
import org.coinpet.dto.bot.UserNotificationDTO;

import java.util.List;

public interface UserRepository {

    Integer addUser(UserDTO user);

    void updateUser(UserDTO user);

    void deleteUserById(Long telegramId);

    UserDTO findUserById(Long telegramId);

    Boolean subscribeUser(SubscriptionDTO subscriptionDTO);

    void unsubscribeUser(SubscriptionDTO subscriptionDTO);

    List<SubscriptionDTO> getUserSubscriptions(Long id);

    List<UserDTO> getAllUsers();

    Integer getUserIdByTelegramId(Long telegramId);

    List<UserNotificationDTO> getUsersToNotify();
}
