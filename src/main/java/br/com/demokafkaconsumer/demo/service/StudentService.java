package br.com.demokafkaconsumer.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import br.com.demokafkaconsumer.demo.dominio.Student;

@Service
public class StudentService {


    @KafkaListener(topics = "topic1", groupId = "meu-grupo-consumidor", containerFactory = "jsonContainerFactory")
    public void consumeMessage(@Payload Student student) {
        System.out.println("Consumed message: " + student);
    }
}
