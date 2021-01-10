package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() throws Exception {
		board= new Board(8,8);
		initialSetup();
		
		
	}
		public ChessPiece [][] getPieces() throws Exception {
			ChessPiece [][] mat= new ChessPiece[board.getLinhas()][board.getColunas()];
			for (int i = 0; i <board.getLinhas(); i++) {
				for (int j = 0; j < board.getColunas(); j++) {
					mat[i][j]= (ChessPiece) board.peça(i,j);
					
				}
			}
			return mat;
			
		}
		private void initialSetup() {
			board.placePiece(new Rook(board,Cor.BLACK),new Position(3,1));
			board.placePiece(new King(board,Cor.BLACK),new Position(4,1));
			
			
			
		}
}
