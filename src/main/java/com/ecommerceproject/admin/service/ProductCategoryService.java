package com.ecommerceproject.admin.service;

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
		ProductCategory category = ProductCategory.build(1, dto.getProduct_Category_Name(), dto.getProduct_Category_Description());
		return dao.save(category);
	}
}
