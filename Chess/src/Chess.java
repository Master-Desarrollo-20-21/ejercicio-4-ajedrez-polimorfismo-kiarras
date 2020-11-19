class Chess {
    final char[] COLORS = new char[] {'w', 'b'};

    private Board board;
    private Player[] players;
    private Turn turn;
    private static final int NUM_PLAYERS = 2;

    public Chess(){
        players = new Player[NUM_PLAYERS];
        for(int i = 0; i < NUM_PLAYERS; i++){
            players[i] = new Player(COLORS[i]);
        }
        board = new Board(players);
        turn = new Turn();
    }

    private void play() {
        do{
            board.show();
            do {
                players[turn.active()].movePiece();
                board.show();
                turn.change();
            } while (!board.checkmate());
            players[turn.noActive()].win();
        }while(isResumed());
    }
    private boolean isResumed(){
        Console console = new Console();
        console.out("Otra partida? (y/n):");
        String entrada = console.inString();
        if(entrada != null && entrada.equals("y")) {
            this.board = new Board(players);
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        new Chess().play();
    }
}
