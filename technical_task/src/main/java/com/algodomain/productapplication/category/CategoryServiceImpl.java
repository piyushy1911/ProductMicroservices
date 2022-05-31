package com.algodomain.productapplication.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.productapplication.entity.Product;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepsitory categoryRepsitory;
	
	@Override
	public List<Product> getProductbyCategory(String category) {
		return (List<Product>) categoryRepsitory.getById(category);
	}

}
