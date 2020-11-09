

public class Draw {

	public static final int DIMENSION = 8;
	private static final char BLANK = '_';
	private static final String COLUMNS = "  a b c d e f g h";
	private Player[] players;

	public Draw(Player[] players){
		this.players = players;
	}

	public void show() {
		Console console = new Console();
		console.out(COLUMNS);
		for (int column = 0; column < DIMENSION; column++) {
			for (int line = 0; line < DIMENSION; line++) {
				console.out(line + " " + this.getPiece(new Coordenate(column,line)) + " ");
			}
			console.out("\n");
		}
		console.out("\n");
	}

	private char getPiece(Coordenate coordenate) {
		assert coordenate != null;
		for (int j = 0; j < players.length; j++) {
			if (this.players[j].getPiece(coordenate) != null) return players[j].getPiece(coordenate).getCode();
		}
		return BLANK;
	}

	public boolean checkmate() {
		return false;
	}

}
