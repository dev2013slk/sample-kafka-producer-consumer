package com.hatchyard.kafkaconfigserver.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * KafkaProducer
 * All rights reserved.
 * Created by Pc on 2/18/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
@Slf4j
public class KafkaProducer {
    private static final String TOPIC = "my_topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void writeMessage(String message){

        log.info("### KafkaProducer ");
        this.kafkaTemplate.send(TOPIC, message);

    }
}
