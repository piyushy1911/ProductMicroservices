package com.algodomain.productapplication.producttype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.algodomain.productapplication.entity.ProductType;

@Repository
public interface ProductTypeRepsitory extends JpaRepository<ProductType, String> {

}
