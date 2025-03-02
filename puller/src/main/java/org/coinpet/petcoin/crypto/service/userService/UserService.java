package org.coinpet.petcoin.crypto.service.userService;

import lombok.RequiredArgsConstructor;
import org.coinpet.petcoin.crypto.repository.CoinRepository;
import org.coinpet.petcoin.crypto.repository.UserRepository;
import org.coinpet.petcoin.crypto.repository.dto.SubscriptionDTO;
import org.coinpet.petcoin.crypto.repository.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserService implements User {
    UserRepository userRepository;
    CoinRepository coinRepository;

    @Override
    public void addUser(UserDTO user) {
        userRepository.addUser(user);
    }

    @Override
    public void deleteUser(Long telegramId) {
        userRepository.deleteUserById(telegramId);
    }

    @Override
    public void subscribeUser(SubscriptionDTO subscriptionDTO) {
        userRepository.subscribeUser(subscriptionDTO);
    }

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
