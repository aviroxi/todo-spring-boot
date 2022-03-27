package com.example.TodoCS173.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TodoCS173.entity.todo;
import com.example.TodoCS173.repository.TodoRepository;
import com.example.TodoCS173.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService{

	private TodoRepository todoRepository;
	
	public TodoServiceImpl(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}

	@Override
	public List<todo> getAllTodos() {
		return todoRepository.findAll();
	}

	@Override
	public todo saveTodo(todo todo_item) {
		return todoRepository.save(todo_item);
	}

}
