package com.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
	}

	@PostConstruct
	public void start() {
		System.out.println("Starting Method");
	}

	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}

}
