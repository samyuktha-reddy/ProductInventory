package com.tsys.pinventory.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ex_Rate")

public class ExchangeRate {
	@Id
	private String currencyAlpha;
	
	private double currencyValue;
	public String getCurrencyAlpha() {
		return currencyAlpha;
	}
	public void setCurrencyAlpha(String currencyAlpha) {
		this.currencyAlpha = currencyAlpha;
	}
	public double getCurrencyValue() {
		return currencyValue;
	}
	public void setCurrencyValue(double currencyValue) {
		this.currencyValue = currencyValue;
	}
	public ExchangeRate(String currencyAlpha, double currencyValue) {
		super();
		this.currencyAlpha = currencyAlpha;
		this.currencyValue = currencyValue;
	}
	public ExchangeRate() {
		super();
	}
	

}
