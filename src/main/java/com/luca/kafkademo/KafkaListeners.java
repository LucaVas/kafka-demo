package com.luca.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "lucaTopic",
            groupId = "foo"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + " \uD83C\uDF89");
    }

}
