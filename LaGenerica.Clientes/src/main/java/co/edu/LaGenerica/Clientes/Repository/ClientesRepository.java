package co.edu.LaGenerica.Clientes.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.LaGenerica.Clientes.Model.Clientes;


@Repository
public interface ClientesRepository  extends MongoRepository <Clientes, String>{

}
