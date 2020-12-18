package com.tsys.pinventory.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsys.pinventory.entity.ProductList;
@Repository
public interface ProductReposirtory extends JpaRepository<ProductList, Integer>{

	ProductList findByItemName(String itemName);

}
