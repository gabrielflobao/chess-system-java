package boardgame;

public class Board {
	private int linhas;
	private int colunas;
	private Piece[][] pe�as;

	public Board(int linhas, int colunas) throws Exception {
		if (linhas < 1 || colunas < 1) {
			throw new Exception("Erro criando tabuleiro, pelo menos que haja 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pe�as = new Piece[linhas][colunas];

	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Piece pe�a(int linha, int coluna) throws Exception {
		if (positionExists(linha, coluna)) {
			throw new Exception("Posi��o�o ocupada");
		}
		return pe�as[linha][coluna];

	}

	public Piece pe�a(Position position) {
		return pe�as[position.getLinha()][position.getColuna()];

	}

	public void placePiece(Piece piece, Position position) {

		pe�as[position.getLinha()][position.getColuna()] = piece;
		piece.position = position;

	}

	private boolean positionExist(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >=0 && coluna< colunas;

	}

	public boolean positionExists(Position position) {
		return positionExist(position.getLinha(), position.getColuna());

	}

	public boolean thereIsaPiece(Position position) throws Exception {
		if (positionExists(position)) {
		throw new Exception("Posi��o nao est� no tabuleiro");
		}
		return pe�a(position) != null;
	}
}
