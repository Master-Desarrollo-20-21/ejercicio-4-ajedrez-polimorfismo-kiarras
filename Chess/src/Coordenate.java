

public class Coordenate {
	private final char[] COLUMNS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
	public int column;
    public int line;

    public Coordenate(int column, int line) {
        this.column = column;
        this.line = line;
    }
    public Coordenate(char column, int line) {
        this.column = setColumn(column);
        this.line = line;
	}

	public Coordenate() {
	}

	public void take() {
        Console console = new Console();
        console.out("Introduce coordenada (Columna,fila): ");
        char[] coord = console.inString().toCharArray();
        column = setColumn(coord[0]);
        line = coord[1];
	}

    private int setColumn(char toSearch) {
            int i = 0;
            while(COLUMNS[i] != toSearch)
            {  i++; }
            return i;
    }

}
