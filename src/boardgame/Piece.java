package boardgame;

public class Piece {
	/* Somente classes e subclasses de um mesmo pacote que poderão acessar o tabuleiro*/
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
}
