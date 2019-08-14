package boardgame;

public abstract class Piece {

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
	
public abstract boolean[][] possibleMoves();

	///metado para mover a posição das peças
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}


