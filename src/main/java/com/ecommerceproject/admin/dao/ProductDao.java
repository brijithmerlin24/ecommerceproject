package com.ecommerceproject.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceproject.admin.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
