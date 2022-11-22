package com.ecommerceproject.admin.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ProductDto {
	
	@NotNull(message = "Product category name cannot be null")
	private String productCategoryName;
	@NotNull(message = "Product name cannot be null")
	private String productName;
	@NotNull(message = "Product description cannot be null")
	private String productDescription;
	@NotNull(message = "Product price cannot be null")
	private int productPrice;
}
