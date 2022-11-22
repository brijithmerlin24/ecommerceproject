package com.ecommerceproject.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name = "Product_Category_Table")
@Getter
@Setter
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ProductCategory {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "Product_Category_Name")
	private String productCategoryName;
	@Column(name = "Product_Category_Description")
	private String productCategoryDescription;
}
