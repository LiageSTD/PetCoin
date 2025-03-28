package org.coinpet.bot.clients;

import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface UserClient {
    @PostExchange("/user/v1/registration")
    void registerUser(@RequestBody UserDTO user);

    @DeleteExchange("/user/v1/registration/{telegram_id}")
    void unregisterUser(@PathVariable("telegram_id") long telegram_id);

    @GetExchange("/user/v1/registration/{user_telegram_id}")
    boolean checkIfUserIsRegistered(@PathVariable("user_telegram_id") Long user_telegram_id);

    @GetExchange("/user/v1/subscriptions/{telegram_id}")
    List<SubscriptionDTO> getUserSubscriptions(@PathVariable("telegram_id") long telegram_id);
}
