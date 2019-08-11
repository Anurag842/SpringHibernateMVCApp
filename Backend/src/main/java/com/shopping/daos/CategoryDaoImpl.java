package com.shopping.daos;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.entity.Category;
import com.shopping.entity.Product;


@Repository(value="categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addCategory(Category cat) {
		try {
			
			Session session=sessionFactory.getCurrentSession();
			session.save(cat);
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}

	

	public boolean updateCategory(Category cat) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product getProduct(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Category> getAllCategories() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("from Category");
			return q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
