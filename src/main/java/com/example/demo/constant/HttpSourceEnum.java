package com.example.demo.constant;

public enum HttpSourceEnum {
	
	SOURCE("pvt/aesss"),
	PRODUCTITEMS("/productItems"),
	CARTS("/carts"),	
	PRICES("/prices"),
	PRODUCTS("/products"),
	ORDERS("/orders"),
	UPDATE_PRICES("/updatePrices");
	private HttpSourceEnum(String name) {
		this.name = name;
	}
	
	private final String name;
	
	public String toString() {
		return name;
	}
}
