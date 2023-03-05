package com.nestjavatraining.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nestjavatraining.product.dao.ProductDao;
import com.nestjavatraining.product.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	@Transactional
	public void addProduct(Product product) {

		productDao.addProduct(product);
	}

	@Override
	@Transactional
	public List<Product> getProducts() {
		List productsList=productDao.getProducts();
		
		return productsList;
	}

	@Override
	@Transactional
	public Product updateProduct(int productId) {
		
		Product updateProduct =productDao.updateProduct(productId);
		return updateProduct;
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		
		productDao.deleteProduct(productId);
		// TODO Auto-generated method stub

	}

}
