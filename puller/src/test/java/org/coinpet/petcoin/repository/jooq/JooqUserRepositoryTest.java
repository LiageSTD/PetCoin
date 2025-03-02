package org.coinpet.petcoin.repository.jooq;

import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;
import org.coinpet.petcoin.crypto.repository.CoinRepository;
import org.coinpet.petcoin.crypto.repository.UserRepository;
import org.coinpet.petcoin.crypto.repository.dto.SubscriptionDTO;
import org.coinpet.petcoin.crypto.repository.dto.UserDTO;
import org.coinpet.petcoin.repository.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(properties = "app.scheduler.enabled=false")
class JooqUserRepositoryTest extends IntegrationTest {
    @Autowired
    UserRepository userRepository;
    @Autowired
    CoinRepository coinRepository;
    static UserDTO testUser1 = new UserDTO((long) 123123, "testName", "testEmail");
    static UserDTO testUser1_2 = new UserDTO((long) 123123, "testName2", "testEmail2");
    static UserDTO testUser2 = new UserDTO((long) 123124, "testName2", "testEmail2");
    static UserDTO testUser3 = new UserDTO((long) 123125, "testName3", "testEmail3");

    @Test
    @Rollback
    @Transactional
    void addUserTest() {
        userRepository.addUser(testUser1);
        UserDTO user = userRepository.findUserById(testUser1.getTelegramId());

        assertEquals(testUser1, user);
    }

    @Test
    @Rollback
    @Transactional
    void updateUserTest() {
        userRepository.updateUser(testUser1);
        UserDTO foundUser = userRepository.findUserById(testUser1.getTelegramId());

        assertEquals(testUser1, foundUser);

        userRepository.updateUser(testUser1_2);
        foundUser = userRepository.findUserById(testUser1.getTelegramId());

        assertEquals(testUser1_2, foundUser);
    }

    @Test
    @Rollback
    @Transactional
    void deleteUserByIdTest() {
        userRepository.deleteUserById(testUser1.getTelegramId());

        UserDTO user = userRepository.findUserById(testUser1.getTelegramId());
        assertNull(user);

        userRepository.addUser(testUser1);
        userRepository.deleteUserById(testUser1.getTelegramId());

        user = userRepository.findUserById(testUser1.getTelegramId());
        assertNull(user);
    }

    @Test
    @Rollback
    @Transactional
    void subscribeUserTest() {
        userRepository.addUser(testUser1);
        coinRepository.addNewCurrency(new Assets.Currency(
                "1",
                1,
                "BTC",
                "Bitcoin",
                0.11f,
                100.01f,
                100000.11f,
                12300123.01f,
                200f
        ));
        SubscriptionDTO subscriptionDTO = new SubscriptionDTO(
                123123L,
                "Bitcoin",
                BigDecimal.ONE,
                "telegram");
        boolean res = userRepository.subscribeUser(subscriptionDTO);
        assertTrue(res);
        List<SubscriptionDTO> subscriptions = userRepository.getUserSubscriptions(subscriptionDTO.getTelegramId());

        assertEquals(subscriptionDTO.getTelegramId(), subscriptions.getFirst().getTelegramId());
        assertEquals(subscriptionDTO.getCurrencyName(), subscriptions.getFirst().getCurrencyName());
        assertEquals(BigDecimal.ONE.longValue(), subscriptions.getFirst().getThreshold().longValue());
    }


    @Test
    @Rollback
    @Transactional
    void unsubscribeUserTest() {
        userRepository.addUser(testUser1);
        coinRepository.addNewCurrency(new Assets.Currency(
                "1",
                1,
                "BTC",
                "Bitcoin",
                0.11f,
                100.01f,
                100000.11f,
                12300123.01f,
                200f
        ));
        SubscriptionDTO subscriptionDTO = new SubscriptionDTO(
                123123L,
                "Bitcoin",
                BigDecimal.ONE,
                "telegram");

        assertTrue(userRepository.subscribeUser(subscriptionDTO));

        List<SubscriptionDTO> shouldBeDescription = userRepository.getUserSubscriptions(subscriptionDTO.getTelegramId());

        assertFalse(shouldBeDescription.isEmpty());

        userRepository.unsubscribeUser(subscriptionDTO);

        List<SubscriptionDTO> subscriptions = userRepository.getUserSubscriptions(subscriptionDTO.getTelegramId());

        assertTrue(subscriptions.isEmpty());
    }

    @Test
    @Rollback
    @Transactional
    void getAllUsersTest() {
        userRepository.addUser(testUser1);
        userRepository.addUser(testUser2);
        userRepository.addUser(testUser3);

        List<UserDTO> users = userRepository.getAllUsers();

        assertEquals(3, users.size());
        assertTrue(users.contains(testUser1));
        assertTrue(users.contains(testUser2));
        assertTrue(users.contains(testUser3));
    }
}
