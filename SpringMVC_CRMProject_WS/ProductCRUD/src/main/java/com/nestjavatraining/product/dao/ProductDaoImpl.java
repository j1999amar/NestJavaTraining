package com.nestjavatraining.product.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nestjavatraining.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addProduct(Product product) {

		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(product);

	}

	@Override
	public List<Product> getProducts() {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<Product> theQuery = currentSession.createQuery("from Product", Product.class);

		List<Product> product = theQuery.getResultList();
		return product;
	}

	@Override
	public Product updateProduct(int productId) {

		Session currentSession = sessionFactory.getCurrentSession();

		Product updateProduct = currentSession.get(Product.class, productId);
		return updateProduct;
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(int productId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Product where id=:productId");
		theQuery.setParameter("productId", productId);

		theQuery.executeUpdate();


	}

}
