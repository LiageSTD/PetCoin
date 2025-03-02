package org.coinpet.petcoin.crypto.repository.dto;

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
