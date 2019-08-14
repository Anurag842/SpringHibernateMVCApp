package com.shoppingfront.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shopping.daos.CategoryDao;
import com.shopping.daos.ProductDao;
import com.shopping.entity.Product;

@Controller
public class ProductController {
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping(value="addProduct",method=RequestMethod.GET)
	public String getProductForm(ModelMap map)
	{
		map.addAttribute("pObj",new Product());
		map.addAttribute("btnLabel","Add Product");
		map.addAttribute("frmLabel","Add Product Form");
		map.addAttribute("categories",categoryDao.getAllCategories());
		return "ProductForm";
	}
	
	@RequestMapping(value="submitProduct",method=RequestMethod.POST)
	public String submitProduct(@ModelAttribute Product pObj,ModelMap map)
	{
		productDao.addProduct(pObj);
		map.addAttribute("msg","Products added");
		map.addAttribute("products",productDao.getAllProducts());
		return "ViewProducts";
	}
	
	

}
