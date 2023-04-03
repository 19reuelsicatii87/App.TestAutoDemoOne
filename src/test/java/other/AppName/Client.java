package other.AppName;

public class Client {

	public static void main(String[] args) {

		String message = "Hi, good morning have a nice day!.";

		/* Constructor Injection - Dependency provided in Constructor
		// ================================================================
		MessageSender emailMessageSenderConstructor = new MessageSender(new EmailService());
		emailMessageSenderConstructor.sendMessage(message);
		MessageSender smsMessageSenderConstructor = new MessageSender(new SMSService());
		smsMessageSenderConstructor.sendMessage(message);*/

		/* Setter Injection - Dependency provided in Setter
		// ================================================================
		MessageSender emailMessageSenderSetter = new MessageSender();
		emailMessageSenderSetter.setMessageService(new EmailService());
		emailMessageSenderSetter.sendMessage(message);*/
		
		// Field Injection - Dependency provided in Field
		// ================================================================
		MessageSender emailMessageSenderField = new MessageSender();
		emailMessageSenderField.messageService = new EmailService();
		emailMessageSenderField.sendMessage(message);
		
	}

}
