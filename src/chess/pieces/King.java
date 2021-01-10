package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Cor;

public class King extends ChessPiece{

	public King(Board board, Cor cor) {
		super(board, cor);
		
	}
	
	public String toString () {
		return "K";
		
		
	}

}
