package com.ecommerceproject.admin.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ProductCategoryDto {
	
	@NotNull(message = "Product category name cannot be null")
	private String productCategoryName;
	@NotNull(message = "Product category description cannot be null")
	private String productCategoryDescription;
}
