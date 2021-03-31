import java.util.Random;

public class Baraja extends Mazo{

    Baraja(){
        super("Baraja");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                cartas[size] = new Carta(i, j);
                size++;
            }
        }
        barajar();
    }

    private void barajar(){
        Random random = new Random();
        for(int i=0; i<100; i++) {
            int src = random.nextInt(52);
            int dst = random.nextInt(52);
            Carta carta = cartas[src];
            cartas[src] = cartas[dst];
            cartas[dst] = carta;
        }
    }

    @Override
    public void show(){
        getLastCarta().print();
        IO io = new IO();
        io.writeln();
    }
}
