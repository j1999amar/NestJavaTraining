package com.nestjavatraining.service;

import java.util.List;

import com.nestjavatraining.dao.ProductDao;
import com.nestjavatraining.dao.ProductDaoImpl;
import com.nestjavatraining.entity.Product;

public class ProductServiceImpl implements ProductService {

	ProductDao productDao = new ProductDaoImpl();

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> listAllProducts() {

		// TODO Auto-generated method stub
		return productDao.listAllProducts();
	}

	@Override
	public Product getProduct(String productCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(String productCode) {
		// TODO Auto-generated method stub

	}

}
