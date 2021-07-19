package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Author;



public interface AuthorRepository extends JpaRepository<Author, Long> {

	
	public List<Author> findByFirstName(String qryNmae);
	public List<Author> findByAddress(String  qryAddress);
}
