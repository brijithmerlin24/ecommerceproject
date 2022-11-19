package com.ecommerceproject.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceproject.admin.model.ProductCategory;

public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {

}
