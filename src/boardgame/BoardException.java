package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID= 1L;
	
	// Declarando o construtor
	public BoardException(String msg) {
		super(msg);
	}

}
