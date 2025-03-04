package org.coinPet.dto.bot;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class UserDTO implements Serializable {
    Long telegramId;

    String name;

    String email;
}
