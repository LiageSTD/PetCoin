package org.coinpet.petcoin.crypto.controller.rest;

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
    void unregisterUser(@PathVariable("telegram_id") long telegram_id) {
        userService.deleteUser(telegram_id);
    }

    @GetMapping("/registration/{telegram_id}")
    boolean checkIfUserIsRegistered(@PathVariable("telegram_id") long telegram_id) {
        return userService.findUserById(telegram_id);
    }

    @GetMapping("/subscriptions/{telegram_id}")
    List<SubscriptionDTO> getUserSubscriptions(@PathVariable("telegram_id") long telegram_id) {
        return userService.getUserSubscriptions(telegram_id);
    }
}
