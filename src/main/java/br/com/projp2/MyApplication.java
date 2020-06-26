package br.com.projp2;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class MyApplication {

    @Value("${queue.carro.name}")
    private String CarroQueue;


    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Bean
    public Queue queue(){
        return new Queue(CarroQueue, true);
    }

}
