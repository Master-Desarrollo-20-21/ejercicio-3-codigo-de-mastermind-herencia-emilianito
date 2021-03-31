public class PlayerHumano extends Player {
    PlayerHumano(char color){
        super(color);
    }

    void put(Board board) {
        put(board, null);
    }

    void put(Board board, Coord origin){
        IO io = new IO();
        Coord coord = new Coord();
        io.writeln("Pone el jugador " + color);
        boolean ok;
        do {
            coord.read("En que casilla?");
            ok = board.empty(coord);
            if(!ok) {
                io.writeln("Esa casilla no esta vacia");
            }
            if (ok && origin != null) {
                ok = !coord.equals(origin);
                if (!ok) {
                    io.writeln("El origen no puede ser el mismo que el destino");
                }
            }
        }while (!ok);
        board.put(coord, color);
    }

    void move(Board board){
        IO io = new IO();
        Coord coord = new Coord();
        io.writeln("Pone el jugador " + color);
        boolean ok;
        do {
            coord.read("De que casilla?");
            ok = board.full(coord, color);
            if(!ok) {
                io.writeln("Esa casilla no esta ocupada");
            }
        }while (!ok);
        board.remove(coord);
        put(board, coord);
    }

}
