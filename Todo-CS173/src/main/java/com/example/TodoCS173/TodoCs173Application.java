package com.example.TodoCS173;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.TodoCS173.entity.todo;
import com.example.TodoCS173.repository.TodoRepository;

@SpringBootApplication
public class TodoCs173Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TodoCs173Application.class, args);
	}
	@Autowired
	private TodoRepository todoRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		todo todo1 = new todo("do homework");
//		
//		todoRepository.save(todo1);
//		
//		todo todo2 = new todo("do individual project");
//		
//		todoRepository.save(todo2);
	}

}
