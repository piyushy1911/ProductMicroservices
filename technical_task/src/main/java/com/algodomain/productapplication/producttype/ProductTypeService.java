package com.algodomain.productapplication.producttype;

import java.util.List;

import com.algodomain.productapplication.entity.Product;

public interface ProductTypeService {
	
	public List<Product> getProductbyProductType(String product_type);
	
}
