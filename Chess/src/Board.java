

class Board {

	private Square[] squares;
	public static final int DIMENSION = 8;
	private static final char BLANK = '_';
	private static final String COLUMNS = "  a b c d e f g h";
	private Player[] players;

	public Board(Player[] players){
		this.players = players;
		setSquares();
	}

	private void setSquares() {
		squares = new Square[DIMENSION*DIMENSION];
		int column = 0;
		int line = 0;
		for (int i = 0; i < squares.length; i++) {
			Coordenate coordenate = new Coordenate(column, line);
			squares[i] = new Square(coordenate, BLANK);
			for (int j = 0; j < players.length; j++) {
				if (this.players[j].getPiece(coordenate) != null) squares[i] = new Square(coordenate, players[j].getPiece(coordenate).getCode());
			}
		}
	}

	public void show() {
		Console console = new Console();
		console.out(COLUMNS);
		for (int column = 0; column < DIMENSION; column++) {
			for (int line = 0; line < DIMENSION; line++) {
				console.out(line + " " + this.getSquare(new Coordenate(column,line)) + " ");
			}
			console.out("\n");
		}
		console.out("\n");
	}

	private char getSquare(Coordenate coordenate) {
		for (int i = 0; i < squares.length; i++) {
			if(coordenate == squares[i].getCoordenate()) return squares[i].getCode();
		}
		return BLANK;
	}

	public boolean checkmate() {
		return false;
	}

}
