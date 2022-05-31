package com.algodomain.productapplication.producttype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.productapplication.entity.Product;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

	
	@Autowired
	ProductTypeRepsitory productTypeRepsitory;

	@Override
	public List<Product> getProductbyProductType(String product_type) {
	
		return (List<Product>) productTypeRepsitory.getById(product_type);
	}

}
