package com.nestjavatraining.product.dao;

import java.util.List;

import com.nestjavatraining.product.entity.Product;

public interface ProductDao {
	
	public void addProduct(Product product);
	public List<Product> getProducts();
	public Product updateProduct(int productId);
	public void deleteProduct(int productId);

	

}
