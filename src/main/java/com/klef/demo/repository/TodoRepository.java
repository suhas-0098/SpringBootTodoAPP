package com.klef.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.demo.entity.Todo;


public interface TodoRepository extends JpaRepository<Todo,Long>{

}
