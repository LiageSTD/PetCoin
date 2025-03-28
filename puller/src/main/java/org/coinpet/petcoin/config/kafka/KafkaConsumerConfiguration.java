package org.coinpet.petcoin.config.kafka;

import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.bot.UserDTO;
import org.coinpet.dto.puller.Assets;
import org.coinpet.petcoin.config.ApplicationConfig;
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
@RequiredArgsConstructor
public class KafkaConsumerConfiguration {
//    @Value("spring.kafka.bootstrap-servers")
//    private String route;
//    @Value("spring.kafka.consumer.group-id")
//    private String groupID;
    private final ApplicationConfig.Kconfig kafkaConfigruration;
    @Bean
    public ConsumerFactory<String, SubscriptionDTO> userUnsubscribeConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaConfigruration.url());
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, kafkaConfigruration.group());
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(),new org.springframework.kafka.support.serializer.JsonDeserializer<>(SubscriptionDTO.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, SubscriptionDTO> kafkaUserUnsubscribeListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, SubscriptionDTO> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(userUnsubscribeConsumerFactory());
        return factory;
    }


}
