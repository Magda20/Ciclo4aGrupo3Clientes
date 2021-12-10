package co.edu.LaGenerica.Clientes.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.LaGenerica.Clientes.Model.Clientes;
import co.edu.LaGenerica.Clientes.Repository.ClientesRepository;



@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:3000")		
public class ClientesAPI {
	@Autowired
	private ClientesRepository clientesRepository;
	
	@PostMapping ("/crear")
	public void agregarCliente(@RequestBody Clientes cliente) {
		clientesRepository.save(cliente);	
	}
	@GetMapping("/listar")
	public List<Clientes> findAll(){
		 return clientesRepository.findAll();
	}
	@GetMapping("/buscar/{cedula}")
	public Optional <Clientes> findById(@PathVariable String cedula) {
		return clientesRepository.findById(cedula);
	
	}
	@DeleteMapping("/borrar/{cedula}")
	public void deleteById(@PathVariable String cedula) {
		clientesRepository.deleteById(cedula);
		
	}
	@PutMapping ("/actualizar")
	public void update (@RequestBody Clientes cliente) {
		clientesRepository.save(cliente);
		
	}
}



