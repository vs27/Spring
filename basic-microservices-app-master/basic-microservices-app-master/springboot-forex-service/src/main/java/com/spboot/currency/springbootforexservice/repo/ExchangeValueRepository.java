/**
 * 
 */
package com.spboot.currency.springbootforexservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spboot.currency.springbootforexservice.model.ExchangeValue;

/**
 * @author HUSSEM-PC
 *
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
