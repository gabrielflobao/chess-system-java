package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	private Cor cor;
	public ChessPiece(Board board,Cor cor) {
		super(board);
		this.cor= cor;
		
	}
	public Cor getCor() {
		return cor;
	}
	
	
	
	

}
