package com.tsys.pinventory.pojo;

import org.springframework.stereotype.Component;

@Component
public class ProductDetails {
	private String itemName;
	private double euroRate;
	private double inrRate;
	private double usdRate;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getEuroRate() {
		return euroRate;
	}
	public void setEuroRate(double euroRate) {
		this.euroRate = euroRate;
	}
	public double getInrRate() {
		return inrRate;
	}
	public void setInrRate(double inrRate) {
		this.inrRate = inrRate;
	}
	public double getUsdRate() {
		return usdRate;
	}
	public void setUsdRate(double usdRate) {
		this.usdRate = usdRate;
	}
	public ProductDetails(String itemName, double euroRate, double inrRate, double usdRate) {
		super();
		this.itemName = itemName;
		this.euroRate = euroRate;
		this.inrRate = inrRate;
		this.usdRate = usdRate;
	}
	public ProductDetails() {
		super();
	}
	

}
