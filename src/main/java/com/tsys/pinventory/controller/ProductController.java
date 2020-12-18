package com.tsys.pinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsys.pinventory.entity.ProductList;
import com.tsys.pinventory.pojo.ProductDetails;
import com.tsys.pinventory.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService prdService;
	@GetMapping(value="/findByProductName")
	public ProductDetails getProductInfo( String prodName)
	{
		return prdService.getProductInfo(prodName);
	}
	
	@PostMapping(value="/addProduct")
	public void addProduct(ProductList productRecord) {
		
		prdService.insertProductDetails(productRecord);
	}
	
	

}
