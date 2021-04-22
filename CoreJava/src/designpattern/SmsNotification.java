package designpattern;

public class SmsNotification  implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("SMS Notification Sent");
		
	}

}
