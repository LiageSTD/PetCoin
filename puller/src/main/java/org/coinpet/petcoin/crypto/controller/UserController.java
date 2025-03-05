package org.coinpet.petcoin.crypto.controller;

import lombok.AllArgsConstructor;
import org.coinpet.petcoin.crypto.service.userService.UserService;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/v1")
@AllArgsConstructor
public class UserController {
    UserService userService;

    @PostMapping("/registration")
    @ResponseStatus(HttpStatus.CREATED)
    void registerUser(@RequestBody UserDTO user) {
        userService.addUser(user);
    }

    @DeleteMapping("/registration/{telegram_id}")
    void unregisterUser(@PathVariable long telegram_id) {
        userService.deleteUser(telegram_id);
    }

    @GetMapping("/registration/{telegram_id}")
    boolean checkIfUserIsRegistered(@PathVariable long telegram_id) {
        return userService.findUserById(telegram_id);
    }

    @PostMapping("/subscriptions")
    boolean subscribeUser(@RequestBody SubscriptionDTO subscriptionDTO) {
        return userService.subscribeUser(subscriptionDTO);
    }

    @DeleteMapping("/subscriptions")
    void unSubscribeUser(@RequestBody SubscriptionDTO subscriptionDTO) {
        userService.unsubscribeUser(subscriptionDTO);
    }

    @GetMapping("/subscriptions/{telegram_id}")
    List<SubscriptionDTO> getUserSubscriptions(@PathVariable long telegram_id) {
        return userService.getUserSubscriptions(telegram_id);
    }
}
