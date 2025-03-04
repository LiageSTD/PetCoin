package org.coinPet.bot.service.commandsHandler.commands;

import lombok.RequiredArgsConstructor;
import org.coinPet.bot.clients.UserClient;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
@Service
@RequiredArgsConstructor
public class UnRegisterHandler implements CommandHandler {
    UserClient userClient;
    @Override
    public String command() {
        return "/untrack";
    }

    @Override
    public String description() {
        return "Use this command to delete your PetCoin account.";
    }

    @Override
    public SendMessage handle(Update update) {
        String[] text = update.getMessage().getText().split(" ");
        if (text.length != 1) {
            return new SendMessage(String.valueOf(update.getMessage().getChatId()), "Invalid input. Example: /unregister");
        }
        userClient.unregisterUser(update.getMessage().getChat().getId());

        return new SendMessage(String.valueOf(update.getMessage().getChatId()), "Your account has been deleted.");
    }
}
