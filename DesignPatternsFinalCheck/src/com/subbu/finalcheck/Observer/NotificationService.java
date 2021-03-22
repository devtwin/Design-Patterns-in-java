package com.subbu.finalcheck.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	public List<Observer> observers = new ArrayList<Observer>();

	public void addSubscriber(Observer observer) {
		observers.add(observer);
		System.out.println("After Adding ::");
		System.out.println(observers);

	}

	public void removeSubscriber(Observer observer) {
		observers.remove(observer);
		System.out.println("After removing ::");
		System.out.println(observers);

	}

	public void notifySubscriber() {
		for (Observer observer : observers) {
			observer.setNotification();
		}

	}

}
