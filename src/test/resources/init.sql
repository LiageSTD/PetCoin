-- Таблица криптовалют
CREATE TABLE cryptocurrencies (
                                  id SERIAL PRIMARY KEY,
                                  symbol VARCHAR(10) NOT NULL UNIQUE,
                                  name VARCHAR(100) NOT NULL,
                                  description TEXT,
                                  rank INTEGER
);

-- Таблица рыночных данных
CREATE TABLE market_data (
                             id SERIAL PRIMARY KEY,
                             crypto_id INTEGER NOT NULL REFERENCES cryptocurrencies(id) ON DELETE CASCADE,
                             timestamp TIMESTAMP NOT NULL,
                             price NUMERIC(20, 8) NOT NULL,
                             supply NUMERIC(30, 8),
                             max_supply NUMERIC(30,8),
                             volume_usd NUMERIC(30,8),
                             market_cap NUMERIC(30, 8),
                             additional_data JSONB,
                             CONSTRAINT uniq_crypto_timestamp UNIQUE (crypto_id, timestamp)
);

-- Таблица бирж
CREATE TABLE exchanges (
                           id SERIAL PRIMARY KEY,
                           name VARCHAR(100) NOT NULL UNIQUE,
                           website VARCHAR(255),
                           country VARCHAR(50),
                           created_at TIMESTAMP NOT NULL DEFAULT NOW()
);

-- Связующая таблица для криптовалют и бирж
CREATE TABLE crypto_exchange (
                                 id SERIAL PRIMARY KEY,
                                 crypto_id INTEGER NOT NULL REFERENCES cryptocurrencies(id) ON DELETE CASCADE,
                                 exchange_id INTEGER NOT NULL REFERENCES exchanges(id) ON DELETE CASCADE,
                                 trading_pair VARCHAR(50) NOT NULL,
                                 created_at TIMESTAMP NOT NULL DEFAULT NOW(),
                                 CONSTRAINT uniq_crypto_exchange_pair UNIQUE (crypto_id, exchange_id, trading_pair)
);

-- Таблица пользователей
CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       username VARCHAR(50) NOT NULL UNIQUE,
                       email VARCHAR(100) NOT NULL UNIQUE,
                       telegram_id BIGINT,
                       password_hash VARCHAR(255) NOT NULL,
                       created_at TIMESTAMP NOT NULL DEFAULT NOW(),
                       last_login TIMESTAMP
);

-- Таблица подписок
CREATE TABLE subscriptions (
                               id SERIAL PRIMARY KEY,
                               user_id INTEGER NOT NULL REFERENCES users(id) ON DELETE CASCADE,
                               crypto_id INTEGER NOT NULL REFERENCES cryptocurrencies(id) ON DELETE CASCADE,
                               threshold NUMERIC(20, 8) NOT NULL,
                               notification_type VARCHAR(20) NOT NULL, -- Например: 'email', 'telegram', 'websocket'
                               created_at TIMESTAMP NOT NULL DEFAULT NOW(),
                               CONSTRAINT uniq_user_crypto UNIQUE (user_id, crypto_id)
);

-- Таблица логов уведомлений
CREATE TABLE notification_logs (
                                   id SERIAL PRIMARY KEY,
                                   user_id INTEGER NOT NULL REFERENCES users(id) ON DELETE CASCADE,
                                   crypto_id INTEGER NOT NULL REFERENCES cryptocurrencies(id) ON DELETE CASCADE,
                                   notification_time TIMESTAMP NOT NULL DEFAULT NOW(),
                                   message TEXT,
                                   status VARCHAR(20) -- Например: 'sent', 'failed'
);
