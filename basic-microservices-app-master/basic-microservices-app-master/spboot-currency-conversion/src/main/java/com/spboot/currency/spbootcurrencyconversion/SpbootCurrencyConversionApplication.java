package com.spboot.currency.spbootcurrencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.spboot.currency.spbootcurrencyconversion.proxy")
@EnableDiscoveryClient

public class SpbootCurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbootCurrencyConversionApplication.class, args);
	}
}
