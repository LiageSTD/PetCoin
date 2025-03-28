package org.coinpet.petcoin.config.api;

import org.springframework.http.MediaType;

public interface CoinCapApiConfiguration {
    String API_BASE_URL = "https://api.coincap.io";
    String API_VERSION = "v1";
    String JSON_CONTENT_TYPE = MediaType.APPLICATION_JSON_VALUE;
}
