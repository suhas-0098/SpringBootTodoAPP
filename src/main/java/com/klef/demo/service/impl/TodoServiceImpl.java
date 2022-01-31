package com.klef.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.demo.entity.Todo;
import com.klef.demo.repository.TodoRepository;
import com.klef.demo.service.TodoService;

@Service
public class TodoServiceImpl implements  TodoService{

	private TodoRepository todoRepository;
	
	
	public TodoServiceImpl(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}


	@Override
	public List<Todo> getAllTodos() {
		
		
		return todoRepository.findAll();
	}


	@Override
	public Todo saveTode(Todo todo) {
		
		return todoRepository.save(todo);
	}


	@Override
	public Todo getTodoById(Long id) {
		
		
		return todoRepository.findById(id).get();
	}


	@Override
	public Todo updateTodo(Todo todo) {
		return todoRepository.save(todo);
	}


	@Override
	public void deleteTodoById(Long id) {
		todoRepository.deleteById(id);
		
	}

}
