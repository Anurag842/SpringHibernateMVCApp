package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.shopping.daos.CategoryDao;
import com.shopping.entity.Category;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryDao categoryDao;
	
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String welcome() {
		System.out.println("inside welcome");
		return "Home";
	}
	
	@RequestMapping(value="getCategoryForm", method=RequestMethod.GET)
	public String fetchCategoryForm(ModelMap map)
	{
		Category category=new Category();
		map.addAttribute("categoryObj",category);
		return "CategoryForm";
	}
	
	@RequestMapping(value="addCategory",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute Category categoryObj,ModelMap map)
	{
		System.out.println(categoryObj.getCategoryId());
		map.addAttribute("categoryObj", categoryObj);
		categoryDao.addCategory(categoryObj);
		return "ViewCategory";
	}

}
