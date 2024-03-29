package org.mambey.kafkaconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class ConsumerService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @KafkaListener(topics = "myTopic", containerFactory = "kafkaListenerContainerFactory", groupId = "group-1")
    public void consumeMessage(String message) {
        logger.info("**** -> Consumed message -> {}", message);
    }

}

