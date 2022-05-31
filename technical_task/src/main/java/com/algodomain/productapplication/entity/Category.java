package com.algodomain.productapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name = "category")
public class Category {
	
	@Id
	private String category;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	@JsonIgnore
	 List<ProductType> type;
	
	public Category() {
	}

	public Category(String category, List<ProductType> type) {
		super();
		this.category = category;
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<ProductType> getType() {
		return type;
	}

	public void setType(List<ProductType> type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Category [category=" + category + ", type=" + type + "]";
	}

	

}
