package com.ecommerceproject.admin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceproject.admin.dto.ProductCategoryDto;
import com.ecommerceproject.admin.model.ProductCategory;
import com.ecommerceproject.admin.service.ProductCategoryService;

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryService service;
	
	@PostMapping("/addCategory")
	public ResponseEntity<ProductCategory> addCategory(@RequestBody @Valid ProductCategoryDto dto) {
		return new ResponseEntity<>(service.addCategory(dto), HttpStatus.CREATED);
	}
}
