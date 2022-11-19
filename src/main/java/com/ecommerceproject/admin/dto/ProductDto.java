package com.ecommerceproject.admin.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ProductDto {
	
	@NotNull(message = "Product category name cannot be null")
	private String product_Category_Name;
	@NotNull(message = "Product name cannot be null")
	private String product_Name;
	@NotNull(message = "Product description cannot be null")
	private String product_Description;
	@NotNull(message = "Product price cannot be null")
	private int product_Price;
}
