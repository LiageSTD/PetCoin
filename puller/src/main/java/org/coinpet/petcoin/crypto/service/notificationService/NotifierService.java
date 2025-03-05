package org.coinpet.petcoin.crypto.service.notificationService;

import lombok.AllArgsConstructor;
import org.coinpet.dto.bot.UserNotificationDTO;
import org.coinpet.petcoin.crypto.repository.CoinRepository;
import org.coinpet.petcoin.crypto.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NotifierService implements Notifier{
    UserRepository userService;
    CoinRepository coinRepository;
    @Override
    public List<UserNotificationDTO> getAllUsersToNotify() {
        return null;
    }
}
