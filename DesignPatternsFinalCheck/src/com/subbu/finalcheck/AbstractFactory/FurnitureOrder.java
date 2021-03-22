package com.subbu.finalcheck.AbstractFactory;

public class FurnitureOrder extends Order {

	@Override
	public void processOrder() {
		System.out.println("Furniture Order has been processed via " + getChannel());

	}

}
