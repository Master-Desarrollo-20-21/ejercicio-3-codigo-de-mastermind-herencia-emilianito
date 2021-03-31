public class MovimientoDescarteBaraja extends Option {
    Baraja baraja;
    Descarte descarte;
    MovimientoDescarteBaraja(Baraja baraja, Descarte descarte){
        super("Mover de Descarte a Baraja");
        this.baraja = baraja;
        this.descarte = descarte;
    }
    @Override
    public void execute() {
        if (!descarte.empty()) {
            Carta carta = descarte.sacar();
            carta.tapar();
            baraja.poner(carta);
        } else {
            IO io = new IO();
            io.writeln("No hay mas cartas en la baraja");
        }
    }
}