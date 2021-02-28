package com.springkafka.springboot_with_kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafkaCon")
public class KafkaController {

  //  @Autowired
  //  KafkaService kafkaService;

    @Autowired
    private KafkaTemplate<String , User> kafkaTemplate;

    private static String Kafka_topic ="Kafaka_boot";


    @GetMapping(value = "/producer/{name}")
    public String message(@PathVariable ("name") String name){
        System.out.println("name : "+name);
        kafkaTemplate.send(Kafka_topic,new User(name, "20","java"));
        return "message sent successfully";
    }


}
