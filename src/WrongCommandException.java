public class WrongCommandException extends Exception {
	private String command;
	public WrongCommandException(String command) {
		this.command = command;
	}

	public WrongCommandException(String command,String message) {
		super(message);
		this.command = command;
	}

	public String getCommand() {
		return command;
	}

}
