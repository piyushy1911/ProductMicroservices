package com.algodomain.productapplication.product;

import java.util.List;

import com.algodomain.productapplication.entity.Product;

public interface ProductService {
	
	public List<Product> getAllProduct();
	
	public Product getProductbyName(String name);
	
	public List<Product> getProductbyPriceRange(String max_price, String min_price);
	
	public Product saveProduct(Product product);
	
	public Product updateProduct(Product product, String name);
	
	public void deleteProduct(String name);


}
