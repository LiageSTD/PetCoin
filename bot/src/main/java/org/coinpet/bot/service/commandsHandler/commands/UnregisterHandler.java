package org.coinpet.bot.service.commandsHandler.commands;

import lombok.AllArgsConstructor;
import org.coinpet.bot.clients.UserClient;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
@Service
@AllArgsConstructor
public class UnregisterHandler implements CommandHandler {
    UserClient botService;
    @Override
    public String command() {
        return "/unregister";
    }

    @Override
    public String description() {
        return "Use this command to delete your PetCoin account.\nExample: /unregister";
    }

    @Override
    public SendMessage handle(Update update) {
        String[] text = update.getMessage().getText().split(" ");
        if (text.length != 1) {
            return new SendMessage(String.valueOf(update.getMessage().getChatId()), "Invalid input. Example: /unregister");
        }
        botService.unregisterUser(update.getMessage().getChat().getId());

        return new SendMessage(String.valueOf(update.getMessage().getChatId()), "Your account has been deleted.");
    }
}
