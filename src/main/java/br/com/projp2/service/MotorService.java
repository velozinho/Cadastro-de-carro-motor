package br.com.projp2.service;

import br.com.projp2.model.Motor;
import br.com.projp2.repository.MotorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MotorService {

    @Autowired
    private MotorRepository motorRepository;

    // Metodo de Salvar
    public Motor insert (Motor motor)
    {
       return motorRepository.save(motor);
    }
    // Metodo de buscar todos
    public List<Motor> findAll(){
        return motorRepository.findAll();
    }
    // metodo de busca por id
    public Optional<Motor> findById(int id){
        return motorRepository.findById(id);
    }
    // Metodo para deletar
    public void delete(int id){
        motorRepository.deleteById(id);
    }
}
