package com.nestjavatraining.dao;

import java.util.List;

import com.nestjavatraining.entity.Product;

public interface ProductDao {
	
	public void saveProduct(Product product);

	public List<Product> listAllProducts();

	public void getProduct(String productCode);

	public void deleteProduct(String productCode);

}
