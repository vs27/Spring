package com.spboot.currency.springbootforexservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.currency.springbootforexservice.model.ExchangeValue;
import com.spboot.currency.springbootforexservice.repo.ExchangeValueRepository;

@RestController
public class ForexController {
	
	//We would want to return the server port back.
	//This will help us identify which instance service is giving the response back
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository respository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = this.respository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
}
