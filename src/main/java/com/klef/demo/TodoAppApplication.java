package com.klef.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.klef.demo.entity.Todo;
import com.klef.demo.repository.TodoRepository;

@SpringBootApplication
public class TodoAppApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Autowired
	private TodoRepository todoRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
//		Todo todo1 = new Todo("wakeup","wakeeee");
//		todoRepository.save(todo1);
//		
//		Todo todo2 = new Todo("walk","walkinggggg");
//		todoRepository.save(todo2);
//		
		
	}

}
