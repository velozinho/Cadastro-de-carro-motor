package Service_teste;
import br.com.projp2.MyApplication;
import br.com.projp2.model.Carro;
import br.com.projp2.model.Motor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import java.util.List;



import br.com.projp2.service.CarroService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyApplication.class)
@WebAppConfiguration
public class CarroServiceTeste {

    @Autowired
    private CarroService carroService;

    @Test
    public void save() throws Exception {

        long qtd = 10;

        //produtoService.deleteAll();

        for ( int i = 1 ; i <= qtd ; i++){

            Carro carro = new Carro();
            Motor motor = new Motor();

            motor.setId(i);
            motor.setPotencia("200");
            motor.setTipo("2.0");

            carro.setId(i);
            carro.setAno(1992);
            carro.setCor("preto");
            carro.setQtd_portas(4);
            carro.setModelo("Elite");
            carro.setMotor(motor);

            carroService.SendCarroRabbit(carro);

        }

        Thread.sleep(5000);
        List<Carro> lst = carroService.findAll();

        System.out.println("Qtd:" + lst.size());
        Assert.assertEquals(lst.size(), qtd);
    }
}
