package org.coinpet.petcoin.config.api;

import org.springframework.http.MediaType;

public interface BotClientApiConfiguration {
    String API_BASE_URL = "http://localhost:8080";
    String ACCEPT = "application/json";
    String JSON_CONTENT_TYPE = MediaType.APPLICATION_JSON_VALUE;
    String API_VERSION = "v1";
}
