package com.ecommerceproject.admin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/listOfCategories")
	public ResponseEntity<List<ProductCategory>> listOfCategories(){
		return ResponseEntity.ok(service.listOfCategories());
	}
	
	@DeleteMapping("/removeCategory/{productCategoryName}")
	public String removeProductCategory(@PathVariable String productCategoryName) {
		service.removeCategory(productCategoryName);
		return "Category deleted successfully";
	}
}
