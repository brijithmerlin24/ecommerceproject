package com.ecommerceproject.admin.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerceproject.admin.model.ProductCategory;

public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {

	@Transactional
	@Modifying
	@Query(value = "delete from Product_Category_Table where Product_Category_Name = :productCategoryName", nativeQuery = true)
	public void deleteByCategoryName(@Param ("productCategoryName") String productCategoryName);
}
