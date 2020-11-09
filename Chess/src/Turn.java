

public class Turn {

    private int value;
	public Turn() {
        value = 0;
	}

	public void change() {
        value =this.noActive();
	}

	public int active() {
		return value;
	}

	public int noActive() {
		return (value + 1) % 2;
	}
    public static void main(String[] args) {
        Console console = new Console();
        Turn turn;
        for (int i = 0; i < 3; i++) {
            turn = new Turn();
            console.out("white: " + turn.active() + "\n");
            console.out("black: " + turn.noActive() + "\n");
            turn.change();
            console.out("Change\n");
            console.out("black: " + turn.active() + "\n");
            console.out("white: " + turn.noActive() + "\n");
            console.out("\n");
        }
    }
}
