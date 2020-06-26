package br.com.projp2.controller;

import br.com.projp2.constant.Constants;
import br.com.projp2.model.Carro;
import br.com.projp2.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping(Constants.API_CARRO)
    public void insert(@RequestBody Carro carro)
    {
         //return  carroService.insert(carro);
         carroService.SendCarroRabbit(carro);
    }

    @GetMapping(Constants.API_CARRO)
    public List<Carro> findAll()
    {
        return carroService.findAll();
    }

    @PutMapping(Constants.API_CARRO)
    public Carro update(@RequestBody Carro carro)
    {
        return  carroService.insert(carro);
    }

    @DeleteMapping(Constants.API_CARRO + "/{id}")
    public void delete(@PathVariable("id") int id){
        carroService.delete(id);
    }

    @GetMapping(Constants.API_CARRO + "/{id}")
    public Optional<Carro> findById(@PathVariable("id") int id){
        return carroService.findById(id);
    }

}
