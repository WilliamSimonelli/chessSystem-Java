package aplication;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import aplication.UI;
public class program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		

	}

}
