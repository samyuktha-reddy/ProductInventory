package com.tsys.pinventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ProductList {
	@Id
	@Column(name="item_Id")
	private int id;
	private String itemName;
	private double itemCost;
	
	public ProductList() {
		super();
	}
	public ProductList(int id, String itemName, double itemCost) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemCost = itemCost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemCost() {
		return itemCost;
	}
	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	

	


}
