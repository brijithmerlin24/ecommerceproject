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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceproject.admin.dto.ProductDto;
import com.ecommerceproject.admin.model.Product;
import com.ecommerceproject.admin.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody @Valid ProductDto dto) {
		return new ResponseEntity<>(service.addProduct(dto), HttpStatus.CREATED);
	}
	
	@GetMapping("/viewProductByName/{productName}")
	public ResponseEntity<Product> viewProductByName(@PathVariable String productName){
		return ResponseEntity.ok(service.viewProductByName(productName));
	}
	
	@GetMapping("/listByCategory/{categoryName}")
	public ResponseEntity<List<Product>> listByCategory(@PathVariable String categoryName){
		return ResponseEntity.ok(service.listByCategory(categoryName));
	}
	
	@GetMapping("/listAllProducts")
	public ResponseEntity<List<Product>> listAllProducts(){
		return ResponseEntity.ok(service.listAllProducts());
	}
	
	@GetMapping("/viewProductByPrice/{productPrice}")
	public ResponseEntity<Product> viewProductByPrice(@PathVariable int productPrice){
		return ResponseEntity.ok(service.viewProductByPrice(productPrice));
	}

	
	@DeleteMapping("/removeProduct/{productName}")
	public String removeProduct(@PathVariable String productName){
		service.removeProduct(productName);
		return "Product deleted successfully";
	}
	
	@PutMapping("/updateProductPrice")
	public String updateProductPrice(@RequestBody Product product) {
		service.updateProductDetails(product);
		return "Product updated successfully";
	}

}

