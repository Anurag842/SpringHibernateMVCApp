package com.shopping.daos;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.entity.Product;


@Repository(value="productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addProduct(Product prod) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateProduct(Product prod) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
