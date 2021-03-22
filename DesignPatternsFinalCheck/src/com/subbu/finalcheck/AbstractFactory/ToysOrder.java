package com.subbu.finalcheck.AbstractFactory;

public class ToysOrder extends Order {

	@Override
	public void processOrder() {
		System.out.println("Toy order has been processed via" + getChannel());

	}

}
