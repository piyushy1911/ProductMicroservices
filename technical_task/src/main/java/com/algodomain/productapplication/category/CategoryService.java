package com.algodomain.productapplication.category;

import java.util.List;

import com.algodomain.productapplication.entity.Product;

public interface CategoryService {
	
	public List<Product> getProductbyCategory(String category);

}
