package org.coinPet.bot.clients;

import org.coinPet.dto.bot.SubscriptionDTO;
import org.coinPet.dto.bot.UserDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface UserClient {
    @PostExchange("localhost/user/v1/registration")
    void registerUser(UserDTO user);

    @DeleteExchange("localhost/user/v1/registration/{telegram_id}")
    void unregisterUser(@PathVariable long telegram_id);

    @GetExchange("localhost/user/v1/registration/{telegram_id}")
    boolean checkIfUserIsRegistered(@PathVariable long telegram_id);

    @PostExchange("localhost/user/v1/subscriptions")
    void subscribeUser(SubscriptionDTO subscriptionDTO);

    @DeleteExchange("localhost/user/v1/subscriptions")
    void unSubscribeUser(SubscriptionDTO subscriptionDTO);

    @GetExchange("localhost/user/v1/subscriptions/{telegram_id}")
    List<SubscriptionDTO> getUserSubscriptions(@PathVariable long telegram_id);
}
