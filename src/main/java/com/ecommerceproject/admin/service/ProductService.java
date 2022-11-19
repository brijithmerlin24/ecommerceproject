package com.ecommerceproject.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ecommerceproject.admin.dao.ProductDao;
import com.ecommerceproject.admin.dto.ProductDto;
import com.ecommerceproject.admin.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao dao;
	
	public Product addProduct(ProductDto dto) {
		Product product = Product.build(1, dto.getProduct_Category_Name(), dto.getProduct_Name(), dto.getProduct_Description(), dto.getProduct_Price());
		return dao.save(product);
	}
}
