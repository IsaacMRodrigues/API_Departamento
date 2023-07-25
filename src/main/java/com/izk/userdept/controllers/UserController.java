package com.izk.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izk.userdept.entities.User;
import com.izk.userdept.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired // instancia sozinho
	private UserRepository repository;

	@GetMapping
	public List<User> findAll() {
		// retorna todos os usuarios do banco de dados
		return repository.findAll();

	}

	@GetMapping(value = "{id}")
	public User findById(@PathVariable Long id) {
		// retorna um usuario do banco de dados
		return repository.findById(id).get();

	}

	@PostMapping
	public User insert(@RequestBody User user) {
		// insere um usuario no banco de dados
		return repository.save(user);

	}
	
	@DeleteMapping
	public void delete(@RequestBody User user) {	
			repository.delete(user);
	}

}
