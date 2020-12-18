package com.tsys.pinventory.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsys.pinventory.entity.ExchangeRate;
@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, String>{
	ExchangeRate findByCurrencyAlpha(String currencyAlpha);

}
