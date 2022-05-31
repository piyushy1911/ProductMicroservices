package com.algodomain.productapplication.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.productapplication.entity.Product;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("product/{category}")
	public List<Product> getProductbyCategory(@PathVariable String category) {
		return categoryService.getProductbyCategory(category);
	}

}
