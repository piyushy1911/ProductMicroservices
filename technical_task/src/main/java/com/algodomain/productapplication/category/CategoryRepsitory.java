package com.algodomain.productapplication.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algodomain.productapplication.entity.Category;

@Repository
public interface CategoryRepsitory extends JpaRepository<Category, String> {

}
