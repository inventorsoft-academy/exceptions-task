public class IllegalEntryException extends RuntimeException{
	private Object entry;
	public IllegalEntryException(Object entry) {
		this.entry = entry;
	}

	public IllegalEntryException(Object entry,String message) {
		super(message);
		this.entry = entry;
	}

	public Object getEntry() {
		return entry;
	}

}
