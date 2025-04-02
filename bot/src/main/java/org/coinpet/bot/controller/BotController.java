package org.coinpet.bot.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.coinpet.bot.service.botService.BotService;
import org.coinpet.dto.bot.UserNotificationDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bot")
@RequiredArgsConstructor
public class BotController {
    private final BotService botService;
    @PostMapping("/notifications/{userTelegramID}")
    public void notifyUser(@RequestBody UserNotificationDTO userNotificationDTO, @PathVariable Long userTelegramID) {
        botService.notifyUser(userNotificationDTO);
    }
    @PostMapping("/notifications")
    public void notifyManyUsers(@RequestBody List<UserNotificationDTO> userNotificationDTOList) {
        botService.notifyAllUsers(userNotificationDTOList);
    }
}
