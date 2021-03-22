package com.subbu.finalcheck.Observer;

public interface INotificationService {
	void addSubscriber(Observer observer);

	void removeSubscriber(Observer observer);

	void notifySubscriber();
}
