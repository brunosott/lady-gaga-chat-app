package br.com.ladygaga.consumer;

import br.com.ladygaga.model.Message;
import br.com.ladygaga.util.KafkaConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @Autowired
    SimpMessagingTemplate template;

    @KafkaListener(
            topics = KafkaConstant.KAFKA_TOPIC,
            groupId = KafkaConstant.GROUP_ID
    )
    public void listen(Message message) {
        System.out.println("sending via kafka listener..");
        template.convertAndSend("/topic/group", message);
    }

}
