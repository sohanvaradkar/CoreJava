
package designpattern;

public class NotificationService
{
public static void main(String[] args) {
	NotificationFactory factory=new NotificationFactory();
	Notification notification=factory.createNotification("PUSH");
	notification.notifyUser();;
	//System.out.println(notification.toString());
}
}
