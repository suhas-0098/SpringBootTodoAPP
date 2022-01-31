package com.klef.demo.service;

import java.util.List;

import com.klef.demo.entity.Todo;

public interface TodoService {
	
	List<Todo> getAllTodos();
	
	Todo saveTode(Todo todo);
	
	
	Todo getTodoById(Long id);
	Todo updateTodo(Todo todo);
	
	
	void deleteTodoById(Long id);

}
