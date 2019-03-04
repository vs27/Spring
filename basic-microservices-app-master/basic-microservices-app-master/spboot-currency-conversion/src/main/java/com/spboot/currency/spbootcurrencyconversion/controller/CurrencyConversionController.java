package com.spboot.currency.spbootcurrencyconversion.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spboot.currency.spbootcurrencyconversion.beans.CurrencyConversionBean;
import com.spboot.currency.spbootcurrencyconversion.proxy.CurrencyExchangeServiceProxy;

@RestController
public class CurrencyConversionController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	  public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
	      @PathVariable BigDecimal quantity) {

	    Map<String, String> uriVariables = new HashMap<>();
	    uriVariables.put("from", from);
	    uriVariables.put("to", to);

	    /*ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
		        "http://localhost:1234/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
		        uriVariables);*/
	    
	    CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);

	    //CurrencyConversionBean response = responseEntity.getBody();

	    return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
	        quantity.multiply(response.getConversionMultiple()), response.getPort());
	  }
}
