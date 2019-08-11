package com.shopping.Backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shopping.daos.ProductDao;
import com.shopping.daos.ProductDaoImpl;
import com.shopping.entity.Category;
import com.shopping.entity.Product;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		ProductDao daoObj=new ProductDaoImpl();

		Category cat=new Category();
		cat.setCategoryId(1);
		cat.setCategoryName("Electronics");
		cat.setcDescription("Electronic items");
		
		Product p=new Product();
		p.setProductId(1);
		p.setProductName("Phone");
		p.setpDescription("A phone");
		p.setCat(cat);
		
		System.out.println(p);
		
		daoObj.addProduct(p);
	}

}
