package org.coinpet.dto.puller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.coinpet.dto.bot.NotificationType;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Getter
@Setter
public class NotificationDTO implements Serializable {
    Long telegramID;

    String currencySymbol;

    BigDecimal currentPrice;

    BigDecimal oldPrice;

    NotificationType notificationType;
}
