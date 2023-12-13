package com.example.hexagonaltest.kafkatest.adapter.out;

import com.example.hexagonaltest.kafkatest.application.port.out.KafkaEventOutPort;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class KafkaProducerOutputAdapter implements KafkaEventOutPort {

    @Value("${producers.topic.basic}")
    private String BASIC_TOPIC = "ASDF";
    @Value("${producers.topic.noti}")
    private String NOTI_TOPIC = "123";

    private final KafkaTemplate<String, String> basicKafkaTemplate;


    @Override
    public void boardWriteEvent(String msg) throws JsonProcessingException {

        log.info("board create kafka 시작");

        basicKafkaTemplate.send(BASIC_TOPIC, msg);

        log.info("board create kafka 끝");



    }

    @Override
    public void notiWriteEvent(String msg) throws JsonProcessingException {

    }
}
