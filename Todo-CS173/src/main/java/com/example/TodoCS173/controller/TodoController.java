package com.example.TodoCS173.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.TodoCS173.entity.todo;
import com.example.TodoCS173.service.TodoService;

@Controller
public class TodoController {
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	@GetMapping("/todos")
	public String listTodos(Model model) {
		model.addAttribute("todos", todoService.getAllTodos());
		return "todos";
	}
	@GetMapping("/todos/new")
	public String CreateTodo(Model model) {
		todo todo_obj = new todo();
		model.addAttribute("todo",todo_obj);
		return "create_todo";
	}
	
	@PostMapping("/todos")
	public String saveTodo(@ModelAttribute("todo") todo todo_item) {
		todoService.saveTodo(todo_item);
		return "redirect:/todos";	
	}
	
	
	
	

}
