package org.example.kafkaconsumer.Kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "output-topic", groupId = "consumer-group")
    public void consume(String message) {
        System.out.println("Message reçu : " + message);
    }
}
