package org.coinpet.dto.bot;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {
    Long telegramId;

    String name;

    String email;
}
