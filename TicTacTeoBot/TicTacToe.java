public  class TicTacToe {

    Player[] players;
    Board board;
    Turn turn;

    TicTacToe() {
        players = new Player[2];
        players[0] = new PlayerBot('x');
        players[1] = new PlayerHumano('o');
        board = new Board();
        turn = new Turn();
    }

    public void play(){
        do {
            board.write();
            if(!board.complete()){
                players[turn.take()].put(board);
            } else {
                players[turn.take()].move(board);
            }
            turn.change();

        } while(!board.existTTT());
        board.write();
        players[turn.noTake()].win();
    }

    public static void main(String[] args){
        new TicTacToe().play();
    }
}