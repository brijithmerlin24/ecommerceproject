package com.ecommerceproject.admin.service;


import java.util.List;

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
		Product product = Product.build(1, dto.getProductCategoryName(), dto.getProductName(), dto.getProductDescription(), dto.getProductPrice());
		return dao.save(product);
	}
	
	public Product viewProductByName(String productName) {
		Product product = dao.findByProductName(productName);
		return product;
	}
	
	public List<Product> listByCategory(String productCategoryName){
		return dao.findByProductCategoryName(productCategoryName);
	}
	
	public List<Product> listAllProducts(){
		return dao.findAll();
	}
	
	public Product viewProductByPrice(int productPrice) {
		Product product = dao.findByProductPrice(productPrice);
		return product;
	}
}
