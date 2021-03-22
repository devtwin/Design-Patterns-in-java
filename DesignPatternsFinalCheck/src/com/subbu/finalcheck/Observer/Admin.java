package com.subbu.finalcheck.Observer;

public class Admin implements Observer {
	private String nameOfAdmin;

	public Admin(String nameOfAdmin) {
		super();
		this.nameOfAdmin = nameOfAdmin;
	}

	public void setNotification() {
		System.out.println(nameOfAdmin + " :: Notification Received");

	}

	public String toString() {
		return nameOfAdmin;
	}

}
