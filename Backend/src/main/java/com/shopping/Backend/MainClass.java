package com.shopping.Backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.shopping.daos.CategoryDao;
import com.shopping.daos.ProductDao;
import com.shopping.daos.ProductDaoImpl;
import com.shopping.entity.Category;
import com.shopping.entity.Product;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\hp\\git\\SpringHibernateMVCApp\\Backend\\src\\main\\java\\spring.xml");
		ProductDao pd=context.getBean("productDao", ProductDao.class);
		//ProductDao daoObj=context.getBean("ProductDao",ProductDao.class);
		//Category cat=context.getBean("CategoryDao",CategoryDao.class);
		
		
		ProductDao daoObj=new ProductDaoImpl();

		Category cat=new Category();
		
		cat.setCategoryId(1);
		cat.setCategoryName("Electronics");
		cat.setcDescription("electronic items");
		
		Product p=new Product();
		p.setProductId(1);
		p.setProductName("laptop");
		p.setpDescription("A laptop");
		p.setCat(cat);
		
		
		System.out.println(p);
		
		
		
		pd.addProduct(p);
	}

}
