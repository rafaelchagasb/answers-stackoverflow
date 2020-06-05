package br.com.rafaelchagasb.example.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

	@GetMapping("{id}")
    public ResponseEntity getById(@PathVariable Integer id) {
		
		Optional<Produto> product = new Service().findById(id);
		
		if(!product.isPresent()) {
			return new ResponseEntity(new Erro("produto nao encontrado"), HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity(product, HttpStatus.FOUND);
    }
}

class Produto {
	public long id;
}

class Service{
	public Optional<Produto> findById(Integer id){
		return Optional.empty();
	}
}

class Erro{
	public String message;

	public Erro(String message) {
		this.message = message;
	}
}