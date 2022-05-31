package com.algodomain.productapplication.producttype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.productapplication.entity.Product;

@RestController
@RequestMapping("/api")
public class ProductTypeController {

	@Autowired
	ProductTypeService productTypeService;
	
	@GetMapping("product/{product_type}")
	public List<Product> getProductbyProductType(@PathVariable String product_type) {
	
		return productTypeService.getProductbyProductType(product_type);
	}
}
