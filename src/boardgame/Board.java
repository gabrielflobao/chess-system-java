package boardgame;

public class Board {
	private int linhas;
	private int colunas;
	private Piece[][] peças;

	public Board(int linhas, int colunas) throws Exception {
		if (linhas < 1 || colunas < 1) {
			throw new Exception("Erro criando tabuleiro, pelo menos que haja 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		peças = new Piece[linhas][colunas];

	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Piece peça(int linha, int coluna) throws Exception {
		if (positionExists(linha, coluna)) {
			throw new Exception("Posiçãoão ocupada");
		}
		return peças[linha][coluna];

	}

	public Piece peça(Position position) {
		return peças[position.getLinha()][position.getColuna()];

	}

	public void placePiece(Piece piece, Position position) {

		peças[position.getLinha()][position.getColuna()] = piece;
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
		throw new Exception("Posição nao está no tabuleiro");
		}
		return peça(position) != null;
	}
}
