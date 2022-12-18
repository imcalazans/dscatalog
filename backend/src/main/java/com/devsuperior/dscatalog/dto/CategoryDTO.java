package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private String Name;
	
	public CategoryDTO() {
		
	}

	public CategoryDTO(Long id, String name) {
		Id = id;
		Name = name;
	}
	
	public CategoryDTO(Category category) {
		this.Id = category.getId();
		this.Name = category.getName();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
	
	

}
