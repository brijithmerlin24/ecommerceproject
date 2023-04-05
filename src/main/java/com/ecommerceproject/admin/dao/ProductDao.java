package com.ecommerceproject.admin.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerceproject.admin.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	@Transactional
	@Modifying
	@Query(value = "insert into Product_Table(Product_Category_Name, Product_Name, Product_Description, Product_Price) values(:productCategoryName, :productName, :productDescription, :productPrice)", nativeQuery = true)
	public int saveNewProduct(@Param("productCategoryName") String productCategoryName, @Param("productName") String productName, @Param("productDescription") String productDescription, @Param("productPrice") int productPrice);
	
	@Query(value = "select * from Product_Table where Product_Name = :productName", nativeQuery = true)

	public Product findByProductName(String productName);
	
	@Query(value = "select * from Product_Table where Product_Category_Name = :productCategoryName", nativeQuery = true)
	public List<Product> findByProductCategoryName(String productCategoryName);
	
	@Query(value = "select * from Product_Table where Product_Price = :productPrice", nativeQuery = true)
	public Product findByProductPrice(int productPrice);
	

	@Transactional
	@Modifying
	@Query(value = "delete from Product_Table where Product_Name = :productName", nativeQuery = true)
	public void deleteProductName(@Param("productName") String productName);

}
