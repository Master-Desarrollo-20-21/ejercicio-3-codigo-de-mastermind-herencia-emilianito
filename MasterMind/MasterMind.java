class MasterMind {
    static final int TOTAL_TRIES = 2;
    static final int ROW_LENGHT = 4;
    static final String COLOR_AVAILABLE = "rgboyv";

    MMGame game;
    IO io;
    MasterMind() {
        game = new MMGame();
        io = new IO();
    }

    void play(){

        String answer;
        do {
            game.run();
            answer = io.readString("Continue? (s/n): ");
        } while (answer.equals("s"));
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }
}
