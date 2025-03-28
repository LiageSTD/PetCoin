package org.coinpet.petcoin.crypto.service.userService;

import lombok.AllArgsConstructor;
import org.coinpet.dto.bot.IsToSubscribe;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;
import org.coinpet.petcoin.crypto.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements User {
    UserRepository userRepository;

    @Override
    public void addUser(UserDTO user) {
        userRepository.addUser(user);
    }

    @Override
    public void deleteUser(Long telegramId) {
        userRepository.deleteUserById(telegramId);
    }

    @Override
    public boolean consumeSubscription(SubscriptionDTO subscriptionDTO) {
        if (subscriptionDTO.getIsToSubscribe().equals(IsToSubscribe.toSubscribe)) {
            return userRepository.subscribeUser(subscriptionDTO);
        } else {
            userRepository.unsubscribeUser(subscriptionDTO);
            return true;
        }
    }
    //TODO: Delete this method
    @Override
    public void unsubscribeUser(SubscriptionDTO subscriptionDTO) {
        userRepository.unsubscribeUser(subscriptionDTO);
    }

    @Override
    public List<SubscriptionDTO> getUserSubscriptions(Long id) {
        return userRepository.getUserSubscriptions(id);
    }

    @Override
    public boolean findUserById(Long telegramId) {
        return userRepository.findUserById(telegramId) != null;
    }
}
