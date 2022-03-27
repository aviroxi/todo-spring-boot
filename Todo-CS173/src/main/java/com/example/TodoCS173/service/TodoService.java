package com.example.TodoCS173.service;

import java.util.List;

import com.example.TodoCS173.entity.todo;

public interface TodoService {
	List<todo> getAllTodos();
	
	todo saveTodo(todo todo_item);
	
}
