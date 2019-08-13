package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		// Declarando o objeto da classe
		ChessMatch chessmatch = new ChessMatch();
		// função para imprimir as peças da partida
		UI.printBoard(chessmatch.getPieces()); // metado recebera a pecas da partida
	}

}