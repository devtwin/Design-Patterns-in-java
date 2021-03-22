package com.subbu.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	private List<INotificationObserver> observers = new ArrayList<INotificationObserver>();

	public void AddSubscriber(INotificationObserver iNotificationObserver) {
		observers.add(iNotificationObserver);
		System.out.println("After Adding ::");
		System.out.println(observers);

	}

	public void RemoveSubscriber(INotificationObserver iNotificationObserver) {
		observers.remove(iNotificationObserver);
		System.out.println("After removing ::");
		System.out.println(observers);

	}

	public void NotifySubscriber() {
		for (INotificationObserver observer : observers) {
			observer.OnServerDown();
		}

	}

}
