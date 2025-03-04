package org.coinPet.bot.service.commandsHandler;

import lombok.RequiredArgsConstructor;
import org.coinPet.bot.service.commandsHandler.commands.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommandsHandlerService {
    @Autowired
    List<CommandHandler> handlers;
    public SendMessage handleMessage(Update update) {
        for (CommandHandler handler : handlers) {
            if (handler.supports(update)) {
                return handler.handle(update);
            }
        }

        return new SendMessage(String.valueOf(update.getMessage().getChatId()), "Command not found");
    }

}
