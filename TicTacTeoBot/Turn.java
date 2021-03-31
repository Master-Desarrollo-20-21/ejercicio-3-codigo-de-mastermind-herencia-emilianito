public class Turn {
    int turn = 0;
    int take(){
        return turn;
    }

    int noTake(){
        return (turn + 1) % 2;
    }

    void change(){
        turn = noTake();
    }
}
