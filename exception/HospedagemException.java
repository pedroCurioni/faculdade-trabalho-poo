package exception;

public class HospedagemException extends Exception {

	public HospedagemException(String message) {
		super("Exceção de hospedagem" + message);
	}

	private static final long serialVersionUID = 3084518949399317039L;

}
