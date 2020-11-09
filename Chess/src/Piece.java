
abstract class Piece {
    protected Coordenate coordenate;
    protected char color;
    protected char code;
    public abstract boolean move(Coordenate coordenate);
    public char getCode(){
        return code;
    }
    
}