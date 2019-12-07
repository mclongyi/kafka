package com.mclongyi.kafka.controller;

import com.mclongyi.kafka.service.KafkaServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    private KafkaServer kafkaServer;


    @GetMapping("/sendMsg/{name}")
    public String sendMsg(@PathVariable("name")String name){
        kafkaServer.sendMsg(name);
        return "发送成功!";
    }



}
