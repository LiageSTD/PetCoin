package org.coinpet.petcoin.crypto.repository.jooq;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.petcoin.crypto.repository.CoinRepository;
import org.coinpet.petcoin.crypto.repository.UserRepository;
import org.coinPet.dto.bot.SubscriptionDTO;
import org.coinPet.dto.bot.UserDTO;

import org.coinpet.petcoin.crypto.repository.jooq.model.public_.Tables;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Slf4j
public class JooqUserRepository implements UserRepository {
    DSLContext dsl;
    CoinRepository coinRepository;

    @Override
    public Integer addUser(UserDTO user) {
        return dsl.insertInto(Tables.USERS)
                .set(Tables.USERS.TELEGRAM_ID, user.getTelegramId())
                .set(Tables.USERS.USERNAME, user.getName())
                .set(Tables.USERS.EMAIL, user.getEmail())
                .returning(Tables.USERS.ID)
                .execute();
    }

    @Transactional
    @Override
    public void updateUser(UserDTO user) {
        UserDTO userInDB = findUserById(user.getTelegramId());
        if (userInDB == null) {
            addUser(user);
            return;
        }
        dsl.update(Tables.USERS)
                .set(Tables.USERS.USERNAME, user.getName())
                .set(Tables.USERS.EMAIL, user.getEmail())
                .where(Tables.USERS.TELEGRAM_ID.eq(user.getTelegramId()))
                .execute();
    }

    @Override
    public void deleteUserById(Long telegramId) {
        dsl.deleteFrom(Tables.USERS)
                .where(Tables.USERS.TELEGRAM_ID.eq(telegramId))
                .execute();
    }

    @Override
    public UserDTO findUserById(Long telegramId) {
        return dsl.select(
                        Tables.USERS.TELEGRAM_ID.as("telegramId"),
                        Tables.USERS.USERNAME.as("name"),
                        Tables.USERS.EMAIL
                )
                .from(Tables.USERS)
                .where(Tables.USERS.TELEGRAM_ID.eq(telegramId))
                .fetchOneInto(UserDTO.class);
    }

    @Transactional
    @Override
    public Boolean subscribeUser(SubscriptionDTO subscriptionDTO) {
            Integer coinID = coinRepository.getCurrencyIdByName(subscriptionDTO.getCurrencyName());
            Integer userID = getUserIdByTelegramId(subscriptionDTO.getTelegramId());

            if (coinID == null || userID == null) {
                log.error("JooqUserRepository: subscribeUser: coinID or userID is null");
                return false;
            }
            dsl.insertInto(Tables.SUBSCRIPTIONS)
                    .set(Tables.SUBSCRIPTIONS.USER_ID, userID)
                    .set(Tables.SUBSCRIPTIONS.CRYPTO_ID, coinID)
                    .set(Tables.SUBSCRIPTIONS.THRESHOLD, subscriptionDTO.getThreshold())
                    .set(Tables.SUBSCRIPTIONS.NOTIFICATION_TYPE, subscriptionDTO.getNotificationType())
                    .execute();
            return true;
    }

    @Override
    public void unsubscribeUser(SubscriptionDTO subscriptionDTO) {
        Integer coinID = coinRepository.getCurrencyIdByName(subscriptionDTO.getCurrencyName());
        Integer userID = getUserIdByTelegramId(subscriptionDTO.getTelegramId());
        if (coinID == null || userID == null) {
            log.error("JooqUserRepository: unsubscribeUser: coinID is null or userID is null");
            return;
        }
        dsl.deleteFrom(Tables.SUBSCRIPTIONS)
                .where(Tables.SUBSCRIPTIONS.USER_ID.eq(userID))
                .and(Tables.SUBSCRIPTIONS.CRYPTO_ID.eq(coinID))
                .execute();
    }

    @Override
    public List<SubscriptionDTO> getUserSubscriptions(Long id) {
        Integer userID = getUserIdByTelegramId(id);
        return dsl.select(
                        Tables.USERS.TELEGRAM_ID.as("telegramId"),
                        Tables.CRYPTOCURRENCIES.NAME.as("currencyName"),
                        Tables.SUBSCRIPTIONS.THRESHOLD,
                        Tables.SUBSCRIPTIONS.NOTIFICATION_TYPE
                )
                .from(Tables.SUBSCRIPTIONS)
                .join(Tables.CRYPTOCURRENCIES)
                .on(Tables.SUBSCRIPTIONS.CRYPTO_ID.eq(Tables.CRYPTOCURRENCIES.ID))
                .join(Tables.USERS)
                .on(Tables.SUBSCRIPTIONS.USER_ID.eq(Tables.USERS.ID))
                .where(Tables.SUBSCRIPTIONS.USER_ID.eq(userID))
                .fetchInto(SubscriptionDTO.class);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return dsl.select(
                        Tables.USERS.TELEGRAM_ID,
                        Tables.USERS.USERNAME,
                        Tables.USERS.EMAIL
                )
                .from(Tables.USERS)
                .fetchInto(UserDTO.class);
    }

    @Override
    public Integer getUserIdByTelegramId(Long telegramId) {
        return dsl.select(Tables.USERS.ID)
                .from(Tables.USERS)
                .where(Tables.USERS.TELEGRAM_ID.eq(telegramId))
                .fetchOneInto(Integer.class);
    }
}
