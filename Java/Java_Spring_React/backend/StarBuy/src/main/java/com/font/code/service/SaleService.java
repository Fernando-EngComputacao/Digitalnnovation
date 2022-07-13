package com.font.code.service;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.font.code.model.Sale;
import com.font.code.repository.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	//Get
	public Page<Sale> findSales(String minDate,String maxDate, Pageable page){
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		return repository.findSales(min, max, page);
	}
}
