package com.shopping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private String pDescription;
	
	@ManyToOne(cascade=CascadeType.ALL/*,fetch=FetchType.EAGER*/)
	@JoinColumn(name="categoryId",insertable=false,updatable=false)
	private Category cat;
	private int categoryId;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getpDescription() {
		return pDescription;
	}
	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", pDescription=" + pDescription
				+ ", cat=" + cat + "]";
	}
	
	

}
