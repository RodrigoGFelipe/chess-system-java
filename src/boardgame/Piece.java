package boardgame;

public class Piece {

	protected Position position; // Declarando o objeto da classe Position
	private Board board; // Declarando a classe board

	// Declarando o construtor
	public Piece(Board board) {
		this.board = board;
		position = null; // Position iniciara com valor null. Java faz essa atribuic�o por padr�o quand n�o e declarado
	}

	// Declarando GET. Protected e somente visivel dentro do mesmo pacote ou nas subclasses.
	protected Board getBoard() {
		return board;
	}

}
