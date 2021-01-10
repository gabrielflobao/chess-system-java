package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board= new Board(8,8);
		
	}
		public ChessPiece [][] getPieces() {
			ChessPiece [][] mat= new ChessPiece[board.getLinhas()][board.getColunas()];
			for (int i = 0; i <board.getLinhas(); i++) {
				for (int j = 0; j < board.getColunas(); j++) {
					mat[i][j]= (ChessPiece) board.pe�a(i,j);
					
				}
			}
			return mat;
			
		}
}
