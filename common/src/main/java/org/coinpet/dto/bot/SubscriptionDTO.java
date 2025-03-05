package org.coinpet.dto.bot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionDTO implements Serializable {
    Long telegramId;

    String currencySymbol;

    BigDecimal threshold;

    String notificationType;
}
