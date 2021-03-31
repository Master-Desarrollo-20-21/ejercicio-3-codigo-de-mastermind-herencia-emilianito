public abstract class Player {
    char color;
    Player(char color){
        this.color = color;
    }

    public void win(){
        IO io = new IO();
        io.writeln("Victoria! " + color);
    }

    abstract void put(Board board);
    abstract void move(Board board);
}
