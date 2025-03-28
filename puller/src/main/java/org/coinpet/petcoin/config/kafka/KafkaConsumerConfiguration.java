package org.coinpet.petcoin.config.kafka;

import com.fasterxml.jackson.databind.JsonDeserializer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;
import org.coinpet.dto.puller.Assets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConsumerConfiguration {
    @Value("spring.kafka.bootstrap-servers")
    private String route;
    @Value("spring.kafka.consumer.group-id")
    private String groupID;

    @Bean
    public ConsumerFactory<String, SubscriptionDTO> userUnsubscribeConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, route);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, groupID);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, SubscriptionDTO> kafkaUserUnsubscribeListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, SubscriptionDTO> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(userUnsubscribeConsumerFactory());
        return factory;
    }


}
