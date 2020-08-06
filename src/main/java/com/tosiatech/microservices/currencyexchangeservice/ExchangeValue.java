package com.tosiatech.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	private BigDecimal exchangeRate;
	private int port;
	
	public ExchangeValue() {
		
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal exchangeRate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
}
