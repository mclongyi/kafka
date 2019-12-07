package com.mclongyi.kafka.service;


import com.mclongyi.kafka.constant.KafkaConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaServer {

    @Autowired
    private KafkaTemplate kafkaTemplate;


    public void sendMsg(String msg){
        kafkaTemplate.send(KafkaConstant.TOPIC_TEST, msg);
    }


}
