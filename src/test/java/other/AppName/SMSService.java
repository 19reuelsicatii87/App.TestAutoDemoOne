package other.AppName;

public class SMSService implements MessageService {

	public void sendMessage(String message) {
		System.out.println("This is from SMSService" + message);
	}

}
