package com.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Pepsi(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Pepsi() {
		super();
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking Pepsi : init");
	}

	public void destroy() throws Exception {
		System.out.println("Throw The Bottle : destroy");

	}

}
