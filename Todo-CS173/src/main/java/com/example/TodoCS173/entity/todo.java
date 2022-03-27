package com.example.TodoCS173.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "todos")
public class todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "todo_item", nullable = false)
	private String todoItem;
	
	public todo(){
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public todo(String todoItem) {
		super();
		this.todoItem = todoItem;
	}
	public String getTodoItem() {
		return todoItem;
	}
	public void setTodoItem(String todoItem) {
		this.todoItem = todoItem;
	}

}
