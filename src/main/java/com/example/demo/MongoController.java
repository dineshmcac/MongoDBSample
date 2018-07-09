package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MongoController {
	
	private MongoRepository1 repo;
	
	public MongoController(MongoRepository1 repo) {
		this.repo = repo;
	}
	
	@PostMapping("/user")
	public Users tickI(@RequestBody Users bean) {
		return repo.save(bean);
	}
	
	@GetMapping("/test")
	public List<Users> tickII() {
		return repo.findAll();
	}
	
	@DeleteMapping("/test")
	public String tickIII(@RequestBody Users bean) {
		repo.delete(bean);
		return "Deleted Successful";
	}

}
