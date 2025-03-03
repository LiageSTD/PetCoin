package org.coinPet.dto.puller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class Assets {

    @JsonProperty("data")
    List<Currency> currencyList;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Currency implements Serializable {
        @JsonProperty("id")
        // unique identifier for asset
        String id;
        @JsonProperty("rank")
        // this number is directly associated with the marketcap whereas the highest marketcap receives rank 1
        Integer rank;

        @JsonProperty("symbol")
        // most common symbol used to identify this asset on an exchange
        String symbol;

        @JsonProperty("name")
        // proper name for asset
        String name;

        @JsonProperty("supply")
        @JsonSetter(nulls = Nulls.SKIP)
        // available supply for trading
        Float supply = (float) 0.00;

        @JsonProperty("maxSupply")
        @JsonSetter(nulls = Nulls.SKIP)
        // total quantity of asset issued
        Float maxSupply = (float) 0.00;

        @JsonProperty("marketCapUsd")
        @JsonSetter(nulls = Nulls.SKIP)
        // supply x price
        Float marketCapUsd = (float) 0.00;

        @JsonProperty("volumeUsd24Hr")
        @JsonSetter(nulls = Nulls.SKIP)
        //quantity of trading volume represented in USD over the last 24 hours
        Float volumeUsd24Hr = (float) 0.00;

        @JsonProperty("priceUsd")
        @JsonSetter(nulls = Nulls.SKIP)
        // volume-weighted price based on real-time market data, translated to USD
        Float priceUSD = (float) 0.00;

    }
}
