package com.shopping.Backend;

import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.shopping.daos.CategoryDao;
import com.shopping.daos.ProductDao;
import com.shopping.entity.Category;
import com.shopping.entity.Product;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\anurag.dutta\\git\\SpringHibernateMVCApp\\Backend\\src\\main\\java\\spring.xml");
		ProductDao pd=context.getBean("productDao", ProductDao.class);
		CategoryDao cd=context.getBean("categoryDao", CategoryDao.class);

		Category cat=new Category();
		cat.setCategoryName("Electronics");
		cat.setcDescription("electronic items");
		
		Product p=new Product();
		p.setProductName("laptop");
		p.setpDescription("A laptop");
		p.setCat(cat);
		
		HashSet<Product> set=new HashSet<Product>();
		set.add(p);
		
		cat.setProd(set);
		
		
		
		
		
		cd.addCategory(cat);
	}

}
