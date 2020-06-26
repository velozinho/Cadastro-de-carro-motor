package br.com.projp2.controller;

import br.com.projp2.constant.Constants;
import br.com.projp2.model.Motor;
import br.com.projp2.service.MotorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MotorController {

    @Autowired
    private MotorService motorService;

    @PostMapping(Constants.API_MOTOR)
    public Motor insert(@RequestBody Motor motor)
    {
        return motorService.insert(motor);
    }

    @GetMapping(Constants.API_MOTOR)
    public List<Motor> findAll()
    {
        return motorService.findAll();
    }

    @PutMapping(Constants.API_MOTOR)
    public Motor update(@RequestBody Motor motor)
    {
        return  motorService.insert(motor);
    }

    @DeleteMapping(Constants.API_MOTOR + "/{id}")
    public void delete(@PathVariable("id") int id){
        motorService.delete(id);
    }

    @GetMapping(Constants.API_MOTOR+ "/{id}")
    public Optional<Motor> findById(@PathVariable("id") int id){
        return motorService.findById(id);
    }
}
