package org.coinpet.petcoin.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class SubscriptionDTO {
    Long telegramId;

    String currencyName;

    BigDecimal threshold;

    String notificationType;
}
