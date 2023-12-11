package com.example.hexagonaltest.kafkatest.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * 설명 : KafakTemplate 객체 생성
 */
@Configuration
@EnableKafka
public class KafkaConfig {

    @Value("${kafka.server.ip}")
    private String ip;

    /**
     * 기능 : Kafka property 생성
     */
    private Map<String, Object> properties() {

        Map<String, Object> props = new HashMap<>();

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, ip);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        return props;
    }

    /**
     * 기능 : Kafka factory 생성
     */
    private DefaultKafkaProducerFactory<String, String> kafkaProducerFactory() {

        DefaultKafkaProducerFactory<String, String> kafkaFactory = new DefaultKafkaProducerFactory<>(properties());

        return kafkaFactory;

    }

    /**
     * 기능 : Kafka Template 생성
     */
    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        KafkaTemplate<String, String> kafkaTemplate = new KafkaTemplate<>(kafkaProducerFactory());

        return kafkaTemplate;
    }







}
