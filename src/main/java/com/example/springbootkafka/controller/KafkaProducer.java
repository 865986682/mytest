package com.example.springbootkafka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class KafkaProducer {
    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;

    // 发送消息
    @GetMapping("/kafka/{message}")
    public void sendMessage(@PathVariable("message") String normalMessage) {
        kafkaTemplate.send("coverage", normalMessage);
    }

}
