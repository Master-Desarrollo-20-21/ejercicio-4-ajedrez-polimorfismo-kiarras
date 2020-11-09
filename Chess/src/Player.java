

public class Player {
    protected Piece[] pieces;
	private char color;

    public Player(char color) {
        this.color = color;
        setPieces();
	}
	
    private void setPieces() {
        this.pieces = new Piece[]{
            new Rook(color,'a'),
            new Knight(color,'b'),
            new Bishop(color,'c'),
            new Queen(color),
            new King(color),
            new Bishop(color,'f'),
            new Knight(color,'g'),
            new Rook(color,'h'),
            new Pawn(color,'a'),
            new Pawn(color,'b'),
            new Pawn(color,'c'),
            new Pawn(color,'d'),
            new Pawn(color,'e'),
            new Pawn(color,'f'),
            new Pawn(color,'g'),
            new Pawn(color,'h')
        };
    }

    public void movePiece() {
        Console console = new Console();
        console.out("Mueven " + color + "\n desde:");
        Piece takedPiece = this.getTakedPiece();
        console.out("hasta: ");
        this.putPiece(takedPiece);
	}


    private void putPiece(Piece takedPiece) {
        Coordenate coordenate = new Coordenate();
        coordenate.take();
        if (takedPiece.move(coordenate)){
            takedPiece.coordenate = coordenate;
        }
    }

    private Piece getTakedPiece() {
        Coordenate coordenate = new Coordenate();
        coordenate.take();
        return getPiece(coordenate);
    }

    public void win() {
        Console console = new Console();
        console.out("Hi, win");
	}
	public Piece getPiece(Coordenate coordenate) {
        for (Piece piece : pieces) {
            if(piece.coordenate.equals(coordenate))return piece;
        }
		return null;
	}
}
