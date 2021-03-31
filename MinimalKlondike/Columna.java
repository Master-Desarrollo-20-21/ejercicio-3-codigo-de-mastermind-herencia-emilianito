public class Columna extends Mazo {
    public Columna(int columna, Baraja baraja) {
        super("Columna-" + columna);
        for (int i = 0; i < columna + 1; i++){
            Carta carta = baraja.sacar();
            if (i == columna) {
                carta.destapar();
            }
            poner(carta);
        }
    }

    @Override
    public void show() {
        for (int i = 0; i < size; i++){
            cartas[i].print();
        }
        IO io = new IO();
        io.writeln();
    }
}
