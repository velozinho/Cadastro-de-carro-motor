package br.com.projp2.repository;

import br.com.projp2.model.Motor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorRepository extends MongoRepository<Motor, Integer> {


}
