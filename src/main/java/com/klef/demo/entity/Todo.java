package com.klef.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="TodoApp")
public class Todo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="title",nullable=false)
	private String title;
	
	@Column(name="desc1",nullable=false)
	private String desc;
	
	public Todo() {
		
	}
	
	public Todo(String title, String desc) {
		super();
		this.title = title;
		this.desc = desc;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	

}
