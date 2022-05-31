package com.algodomain.productapplication.product;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.productapplication.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	@Autowired
	SessionFactory factory;

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductbyName(String name) {
		return productRepository.getById(name);
	}

	@Override
	public List<Product> getProductbyPriceRange(String max_price, String min_price) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Product.class);
		criteria.add(Expression.between("price", min_price, max_price));
		List<Product> list = criteria.list();
		return list;
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product, String name) {
		Product p = productRepository.getById(name);
		p.setName(product.getName());
		p.setPrice(product.getPrice());
		p.setRam(product.getRam());
		p.setSize(product.getSize());
		p.setSsd(product.getSsd());
		return productRepository.save(p);
	}

	@Override
	public void deleteProduct(String name) {
		productRepository.deleteById(name);

	}

}
