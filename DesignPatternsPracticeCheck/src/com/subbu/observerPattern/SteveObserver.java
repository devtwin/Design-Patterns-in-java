
package com.subbu.observerPattern;

public class SteveObserver implements INotificationObserver {

	String name;

	public SteveObserver(String name) {
		super();
		this.name = name;
	}

	public void OnServerDown() {
		System.out.println(name + " :: notification has been received");

	}

	@Override
	public String toString() {
		return name;
	}

}
