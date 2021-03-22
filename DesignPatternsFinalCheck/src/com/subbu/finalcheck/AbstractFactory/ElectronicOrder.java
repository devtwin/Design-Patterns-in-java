package com.subbu.finalcheck.AbstractFactory;

public class ElectronicOrder extends Order {

	public void processOrder() {
		System.out.println("Electronic Order has been processed via " + getChannel());

	}

}
