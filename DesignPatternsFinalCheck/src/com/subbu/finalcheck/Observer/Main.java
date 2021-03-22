package com.subbu.finalcheck.Observer;

public class Main {

	public static void main(String[] args) {
		Observer subbu = new Admin("Subbu");
		Observer raj = new Admin("Raj");
		Observer maha = new Admin("Maha");

		INotificationService notificationService = new NotificationService();
		notificationService.addSubscriber(subbu);
		notificationService.addSubscriber(raj);
		notificationService.addSubscriber(maha);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(subbu);

	}

}
