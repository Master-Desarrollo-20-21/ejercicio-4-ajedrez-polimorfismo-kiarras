

public class Pawn extends Piece{

	public Pawn(char color, char c) {
        this.color = color;
        this.code = setCode();
        this.coordenate = new Coordenate(c, getLine(color));
	}

    private int getLine(char color) {
        if(color == 'w'){
            return 6;
        }
        return 1;
    }

    private char setCode() {
        if(color == 'w'){
            return 'p';
        }
        return 'P';
    }
    @Override
    public boolean move(Coordenate coordenate){
        if(Math.abs(this.coordenate.column-coordenate.column) > 1 ||
        Math.abs(this.coordenate.line-coordenate.line) > 1 ||
        coordenate.line == getLine(color) && Math.abs(this.coordenate.line-coordenate.line) > 2
        ) return false;
        return true;
    }

}
