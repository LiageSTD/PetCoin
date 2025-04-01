package org.coinpet.bot.configuration.kafka;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.coinpet.bot.configuration.ApplicationConfig;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;
@RequiredArgsConstructor
@Configuration
public class KafkaConsumerConfiguration {
    private final ApplicationConfig.Kafka kafkaConfig;
    @Bean
    public ConsumerFactory<String, SubscriptionDTO> userNotificationConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaConfig.bootstrapServers());
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, kafkaConfig.groupId());
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(SubscriptionDTO.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, SubscriptionDTO> kafkaUserNotificationListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, SubscriptionDTO> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(userNotificationConsumerFactory());
        return factory;
    }

}
