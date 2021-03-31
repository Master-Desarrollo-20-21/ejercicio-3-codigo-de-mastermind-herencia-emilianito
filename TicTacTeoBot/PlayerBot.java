import java.util.List;
import java.util.Random;

public class PlayerBot extends Player {
    PlayerBot(char color){
        super(color);
    }
    void put(Board board){
        List<Coord> coordsAvailable = board.getCoordsAvailable();
        board.put(coordsAvailable.get(new Random().nextInt(coordsAvailable.size())), color);
    }
    void move(Board board){
        List<Coord> coordsOcupadas = board.getCoordsOcupadas(color);
        List<Coord> coordsAvailable = board.getCoordsAvailable();
        board.remove(coordsOcupadas.get(new Random().nextInt(coordsOcupadas.size())));
        board.put(coordsAvailable.get(new Random().nextInt(coordsOcupadas.size())), color);
    }
}
