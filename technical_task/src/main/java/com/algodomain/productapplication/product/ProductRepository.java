package com.algodomain.productapplication.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algodomain.productapplication.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
