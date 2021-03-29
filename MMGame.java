class MMGame {

    MMCode secretCode;
    MMHistory history;
    IO io;

    MMGame() {
        secretCode = new MMSecretCode();
        history = new MMHistory();
        io = new IO();
    }

    void run(){
        boolean winner = false;
        int tries = 0;
        history.clear();
        while (tries < MasterMind.TOTAL_TRIES) {
            history.print();
            secretCode.print();
            MMCode code = new MMCode();
            code.ask();
            MMWBResponse wb = secretCode.match(code);
            if (wb.isWinner()) {
                winner = true;
                tries = MasterMind.TOTAL_TRIES;
            } else {
                history.add(code, wb);
                tries++;
            }
        }

        if (winner) {
            io.writeln("You've won!!!");
        }else{
            io.writeln("You've lost!!!");
        }
    }

}