package com.subbu.observerPattern;

public class JohnObserver implements INotificationObserver {
	String name;

	public void OnServerDown() {

		System.out.println(name + " :: notification has been received");

	}

	@Override
	public String toString() {
		return name;
	}

	public JohnObserver(String name) {
		super();
		this.name = name;
	}

}
