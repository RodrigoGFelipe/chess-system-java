package boardgame;

public class Piece {

	protected Position position;
	private Board board; // Declarando a classe board

	// Declarando o construtor
	public Piece(Board board) {
		this.board = board;
		position = null; // Position iniciara com valor null. Java faz essa atribuic�o por padr�o quando
							// n�o e declarado
	}

	// Declarando GET
	protected Board getBoard() {
		return board;
	}

}
