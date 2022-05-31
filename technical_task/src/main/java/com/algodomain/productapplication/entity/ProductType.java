package com.algodomain.productapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name = "prooducttype")
public class ProductType {
	
	@Id
	private String product_type;
	
	@ManyToOne()
	@JoinColumn(name = "category")
	private Category category;
	
	@OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Product> product;
	
	public ProductType() {
	}

	public ProductType(String product_type, Category category, List<Product> product) {
		super();
		this.product_type = product_type;
		this.category = category;
		this.product = product;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductType [product_type=" + product_type + ", category=" + category + ", product=" + product + "]";
	}

	
}
