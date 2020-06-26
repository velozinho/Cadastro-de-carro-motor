package br.com.projp2.rabbit;

import br.com.projp2.model.Carro;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarroProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Carro carro){
        rabbitTemplate.convertAndSend(this.queue.getName(), carro);
    }
}
