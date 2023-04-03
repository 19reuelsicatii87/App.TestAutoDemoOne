package other.AppName;

public class MessageSender {

	public MessageService messageService;

	// Field Injection
	// ================================================================
	public MessageSender() {
		System.out.println("field based dependency injection");
	};

	/*
	 * Constructor Injection //
	 * ================================================================ public
	 * MessageSender(MessageService messageService) { super(); this.messageService =
	 * messageService; System.out.println("constructor based dependency injection");
	 * }
	 */

	/*
	 * Setter Injection //
	 * ================================================================ public void
	 * setMessageService(MessageService messageService) { this.messageService =
	 * messageService; System.out.println("setter based dependency injection");
	 * 
	 * }
	 */

	public void sendMessage(String message) {
		this.messageService.sendMessage(message);
	}

}
