package org.coinpet.bot.service.commandsHandler;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.coinpet.bot.service.commandsHandler.commands.Command;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandsHandlerService {

    private final List<Command> handlers;

    public SendMessage handleMessage(Update update) {
        for (Command handler : handlers) {
            if (handler.supports(update)) {
                return handler.handle(update);
            }
        }

        return new SendMessage(String.valueOf(update.getMessage().getChatId()), "Command not found");
    }

}
