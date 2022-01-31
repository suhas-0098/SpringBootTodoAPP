package com.klef.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.klef.demo.entity.Todo;
import com.klef.demo.service.TodoService;

@Controller
public class TodoController {
	
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	//handler method to handle list students and return mode and view
	
	@GetMapping("/todos")
	public String listTodos(Model model) {
		
		model.addAttribute("todos",todoService.getAllTodos());
		
		return "todos";
	}
	
	
	@GetMapping("/todos/new")
	public String createTodoForm(Model model) {
		
		//create todo object to hold todo form data
		Todo todo = new Todo();
		model.addAttribute("todo",todo);
		return "create_todo";
		
		
	}
	
	@PostMapping("/todos")
	public String saveTodo(@ModelAttribute("todo") Todo todo) {
		
		todoService.saveTode(todo);
		return "redirect:/todos";
		
	}
	
	@GetMapping("/todos/edit/{id}")
	public String editTodoForm(@PathVariable Long id ,Model model) {
		
		model.addAttribute("todo",todoService.getTodoById(id));
		return "edit_todo";
	}
	
	@PostMapping("/todos/{id}")
	public String updateTodo(@PathVariable Long id ,@ModelAttribute("todo") Todo todo, Model model) {
		
		//get student from database by id
		Todo existingTodo = todoService.getTodoById(id);
		existingTodo.setId(id);
		existingTodo.setTitle(todo.getTitle());
		existingTodo.setDesc(todo.getDesc());
		
		//save
		todoService.updateTodo(existingTodo);
		
		return "redirect:/todos";
		
	}
	
	//handler method to handle delete todo request
	
	@GetMapping("/todos/{id}")
	public String deleteTodo(@PathVariable Long id) {
		todoService.deleteTodoById(id);
		
		return "redirect:/todos";
	}
	
	
	
	
	

}
