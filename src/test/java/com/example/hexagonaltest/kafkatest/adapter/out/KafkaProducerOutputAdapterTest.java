package com.example.hexagonaltest.kafkatest.adapter.out;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KafkaProducerOutputAdapterTest {

    @Autowired
    KafkaProducerOutputAdapter kafkaProducerOutputAdapter;

    @Test
    public void test() throws JsonProcessingException {

        kafkaProducerOutputAdapter.boardWriteEvent("hi");

    }


}