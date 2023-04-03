package other.AppName;

public class EmailService implements MessageService {

	public void sendMessage(String message) {
		System.out.println("This is from EmailService: " + message);
	}

}
