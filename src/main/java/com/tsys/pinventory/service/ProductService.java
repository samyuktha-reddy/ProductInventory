package com.tsys.pinventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsys.pinventory.entity.ExchangeRate;
import com.tsys.pinventory.entity.ProductList;
import com.tsys.pinventory.pojo.ProductDetails;
import com.tsys.pinventory.repo.ExchangeRateRepository;
import com.tsys.pinventory.repo.ProductReposirtory;

@Service
public class ProductService {
	private static final String INR_CURRENCY_NAME = "INR";
	private static final String EURO_CURRENCY_NAME = "EUR";
	@Autowired
	private ProductReposirtory prdRepo;
	@Autowired
	private ExchangeRateRepository excRateRepo;

	public ProductDetails getProductInfo(String prodName) {
		ProductList productEntity = prdRepo.findByItemName(prodName);

		ProductDetails prdDetails = new ProductDetails();
		prdDetails.setItemName(prodName);
		prdDetails.setUsdRate(productEntity.getItemCost());
		prdDetails.setEuroRate(excRateRepo.
				findByCurrencyAlpha(EURO_CURRENCY_NAME).getCurrencyValue()*productEntity.getItemCost());
		prdDetails.
		setInrRate(excRateRepo.
				findByCurrencyAlpha(INR_CURRENCY_NAME).getCurrencyValue()*productEntity.getItemCost());
		return prdDetails;
	}
	
	public void insertProductDetails(ProductList productDetails) {
		prdRepo.save(productDetails);
	}

}
