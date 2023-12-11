package com.example.hexagonaltest.kafkatest.application.port.out;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface KafkaEventOutPort {

    void boardWriteEvent(String msg) throws JsonProcessingException;

    void notiWriteEvent(String msg) throws JsonProcessingException;


}
