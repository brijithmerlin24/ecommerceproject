package com.ecommerceproject.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerceproject.admin.dao.ProductCategoryDao;
import com.ecommerceproject.admin.dto.ProductCategoryDto;
import com.ecommerceproject.admin.model.ProductCategory;

@Service
public class ProductCategoryService {
	
	@Autowired
	private ProductCategoryDao dao;
	
	public ProductCategory addCategory(ProductCategoryDto dto) {
		ProductCategory category = ProductCategory.build(1, dto.getProductCategoryName(), dto.getProductCategoryDescription());
		return dao.save(category);
	}
	
	public List<ProductCategory> listOfCategories(){
		return dao.findAll();
	}
}
