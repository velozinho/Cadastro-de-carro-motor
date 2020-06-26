package br.com.projp2.service;

import br.com.projp2.model.Carro;
import br.com.projp2.rabbit.CarroProducer;
import br.com.projp2.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;
    @Autowired
    private CarroProducer carroProducer;

    public void SendCarroRabbit(Carro carro)
    {
        carroProducer.send(carro);
    }

    //Metodo de salvar
    public Carro insert(Carro carro)
    {
        return carroRepository.save(carro);
    }
    // Metodo de buscar todos
    public List<Carro> findAll(){
        return carroRepository.findAll();
    }
    // Metodo de busca por id
    public Optional<Carro> findById(int id){
        return carroRepository.findById(id);
    }
    //Metodo para deletar
    public void delete(int id){
        carroRepository.deleteById(id);
    }
}
