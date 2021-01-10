package boardgame;

public class Board {
	private int linhas;
	private int colunas;
	private Piece[][] pe�as;
	public Board(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pe�as = new Piece [linhas][colunas];
		
		
	}
	public int getLinhas() {
		return linhas;
	}
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	public int getColunas() {
		return colunas;
	}
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public Piece pe�a (int linha, int coluna ) {
		return pe�as[linha][coluna];
		
	}
	public Piece pe�a(Position position) {
		return pe�as[position.getLinha()][position.getColuna()];
		
	}
	public void placePiece (Piece piece, Position position) {
		pe�as[position.getLinha()][position.getColuna()]=piece;
		piece.position=position;
		
		
		
		
	}
}
