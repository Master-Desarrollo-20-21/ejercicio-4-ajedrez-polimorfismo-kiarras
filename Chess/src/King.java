

public class King  extends Piece{

	public King(char color) {
        this.color = color;
        this.code = setCode();
        this.coordenate = new Coordenate(4, getLine(color));
	}

    private int getLine(char color) {
        if(color == 'w'){
            return 7;
        }
        return 0;
    }

    private char setCode() {
        if(color == 'w'){
            return 'k';
        }
        return 'K';
    }
    @Override
    public boolean move(Coordenate coordenate){
        if( Math.abs(this.coordenate.column-coordenate.column) > 1 ||
        Math.abs(this.coordenate.line-coordenate.line) > 1
        ) return false;
        return true;
    }
}
