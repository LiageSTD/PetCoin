package org.coinPet.dto.bot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionDTO {
    Long telegramId;

    String currencyName;

    BigDecimal threshold;

    String notificationType;
}
