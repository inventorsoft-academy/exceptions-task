public class WrongCommandException extends Exception {
	private int command;
	public WrongCommandException(int command) {
		this.command = command;
	}

	public WrongCommandException(int command,String message) {
		super(message);
		this.command = command;
	}

	public int getCommand() {
		return command;
	}

}
