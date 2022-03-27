package com.example.TodoCS173.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TodoCS173.entity.todo;

public interface TodoRepository extends JpaRepository<todo, Long>{
	

}
