package com.algodomain.productapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "product")
public class Product {
	
	@Id
	private String name;
	private String ram;
	private String ssd;
	private String size;
	private String price;
	
	@ManyToOne()
	@JoinColumn(name = "product_type")
	private ProductType type;
	
	public Product() {
	}

	public Product(String name, String ram, String ssd, String size, String price, ProductType type) {
		super();
		this.name = name;
		this.ram = ram;
		this.ssd = ssd;
		this.size = size;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", ram=" + ram + ", ssd=" + ssd + ", size=" + size + ", price=" + price
				+ ", type=" + type + "]";
	}

	

}
