package com.stock.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.stock.models.StockPrice;
import com.stock.service.CompanyService;

@RestController
public class ApiController {
	
	@Autowired CompanyService cmpservice;

	@GetMapping("/api/data/{id}")
	public List<StockPrice> chartData(@PathVariable("id")int id) {
		List<StockPrice> plist= cmpservice.getPriceDetails(id);
		return plist;
	}
}
