package com.algodomain.productapplication.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.productapplication.entity.Product;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("product")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}

	@GetMapping("product/{name}")
	public Product getProductbyName(@PathVariable String name) {
		return productService.getProductbyName(name);
	}

	@GetMapping("product/{max_price}/{min_price}")
	public List<Product> getProductbyPriceRange(@PathVariable String max_price, @PathVariable String min_price) {
		return productService.getProductbyPriceRange(max_price, min_price);
	}

	@PostMapping("product")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@PutMapping("product")
	public Product updateProduct(@RequestBody Product product, @PathVariable String name) {
		return productService.updateProduct(product, name);
	}

	@DeleteMapping("product")
	public String deleteProduct(@PathVariable String name) {
		productService.deleteProduct(name);
		return "Product deleted successfully !!";
	}
	
	

	
}
