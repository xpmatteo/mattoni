package name.vaccari.matteo.xml;

public class ElementNotFoundException extends RuntimeException {

	public ElementNotFoundException() {
	}

	public ElementNotFoundException(String message) {
		super(message);

	}

	public ElementNotFoundException(Throwable cause) {
		super(cause);

	}

	public ElementNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

}
