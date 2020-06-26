package br.com.projp2.repository;

import br.com.projp2.model.Carro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends MongoRepository<Carro, Integer> {


}
