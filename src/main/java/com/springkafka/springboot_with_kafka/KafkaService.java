/*
package com.springkafka.springboot_with_kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String , String> kafkaTemplate;

     String Kafka_topic ="Kafaka_boot";

    public void sendkafka(String message){
           kafkaTemplate.send(Kafka_topic,message);
    }
}
*/
