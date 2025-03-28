//package org.coinpet.petcoin.config.kafka;
//
//import org.apache.kafka.clients.admin.AdminClientConfig;
//import org.apache.kafka.clients.admin.NewTopic;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.core.KafkaAdmin;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class KafkaTopicConfig {
//    @Value(value = "${spring.kafka.bootstrap-servers}")
//    private String bootstrapAddress;
//
//
//    @Bean
//    public NewTopic topic_first() {
//        return new NewTopic("puller-currency", 1, (short) 1);
//    }
//
//    @Bean
//    public NewTopic topic1_reply() {
//        return new NewTopic("puller-currency-reply", 1, (short) 1);
//    }
//
//}
