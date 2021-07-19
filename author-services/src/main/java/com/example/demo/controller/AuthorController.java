package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Author;
import com.example.demo.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	public AuthorService service;

	@GetMapping(path = "/authors")
	public List<Author> getAll(){
		return this.service.getAll();
	}
	
	
	@PostMapping(path ="/authors")
	public ResponseEntity<Author> add(@RequestBody Author entity) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.add(entity));
	}
	
	
	@GetMapping(path="/authors/srch/name/{firstName}")
	public List<Author> getByFirstNmae(@PathVariable("firstName") String firstName){
		return this.service.getByFirstName(firstName);
		
		
	}
	@GetMapping(path="/authors/srch/address/{address}")
	public List<Author> getByAddress(@PathVariable("address") String address){
		return this.service.getByAddress(address);
		
	}
	
}
