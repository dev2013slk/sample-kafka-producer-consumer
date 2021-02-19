package com.hatchyard.kafkaconfigserver.controller;

import com.hatchyard.kafkaconfigserver.service.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * KafkaController
 * All rights reserved.
 * Created by Pc on 2/18/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@RestController
@RequestMapping("/kafka")
@Slf4j
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public void writeMessageToTopic(@RequestParam("message") String message){

        log.info(" ### KafkaController : " + message);
        kafkaProducer.writeMessage(message);
    }
}
