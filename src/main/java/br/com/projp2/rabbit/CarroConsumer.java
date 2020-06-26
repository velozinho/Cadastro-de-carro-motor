package br.com.projp2.rabbit;

import br.com.projp2.model.Carro;
import br.com.projp2.service.CarroService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class CarroConsumer {

    @Autowired
    private CarroService carroService;

    @RabbitListener(queues = {"${queue.carro.name}"})
    public void receive (@Payload Carro carro){
        System.out.println("Id: "+ carro.getId() +
                           "\nModelo: " + carro.getModelo() +
                           "\nCor:" + carro.getCor() +
                           "\nAno:" + carro.getAno() +
                           "\nQtdPortas:" + carro.getQtd_portas() +
                           "\nMotor:" + carro.getMotor());

        //Inseri dado no banco de dados
        carroService.insert(carro);
    }
}
