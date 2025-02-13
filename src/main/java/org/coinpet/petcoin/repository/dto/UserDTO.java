package org.coinpet.petcoin.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    Long telegramId;

    String name;

    String email;
}
