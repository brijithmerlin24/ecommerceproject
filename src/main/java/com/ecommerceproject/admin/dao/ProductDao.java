package com.ecommerceproject.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceproject.admin.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	public Product findByProductName(String productName);

	public List<Product> findByProductCategoryName(String productCategoryName);
	
	public Product findByProductPrice(int productPrice);
//	public void deleteByProductName(String productName);
}
