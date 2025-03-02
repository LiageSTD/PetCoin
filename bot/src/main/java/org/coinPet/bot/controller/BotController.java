package org.coinPet.bot.controller;

import org.coinPet.dto.bot.UserNotificationDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bot")
public class BotController {
    @PostMapping("/notifications")
    public void notifyUser(UserNotificationDTO userNotificationDTO) {
        System.out.println("User with ID "
                + userNotificationDTO.getUserTelegramID()
                + " has been notified about "
                + userNotificationDTO.getCoinNameToNotifyAbout()
                + " with message: " + userNotificationDTO.getMessage());
    }
}
