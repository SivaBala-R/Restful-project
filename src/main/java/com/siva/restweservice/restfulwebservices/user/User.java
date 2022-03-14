package com.siva.restweservice.restfulwebservices.user;

import java.util.Date;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
	
	private Integer id;
	
	@Size(min=2)
	private String name;
	
	@Past
	private Date birhtDate;
	
	

	public User(Integer id, String name, Date birhtDate) {
		super();
		this.id = id;
		this.name = name;
		this.birhtDate = birhtDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirhtDate() {
		return birhtDate;
	}

	public void setBirhtDate(Date birhtDate) {
		this.birhtDate = birhtDate;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, birhtDate=%s]", id, name, birhtDate);
	} 
	
	

}
