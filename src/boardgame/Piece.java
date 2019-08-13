package boardgame;

public class Piece {

	protected Position position; // Declarando o objeto da classe Position
	private Board board; // Declarando a classe board

	// Declarando o construtor
	public Piece(Board board) {
		this.board = board;
		position = null; // Position iniciara com valor null. Java faz essa atribuicão por padrão quand não e declarado
	}

	// Declarando GET. Protected e somente visivel dentro do mesmo pacote ou nas subclasses.
	protected Board getBoard() {
		return board;
	}

}
