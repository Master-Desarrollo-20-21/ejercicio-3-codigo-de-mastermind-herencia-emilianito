public class MovimientoBarajaDescarte extends Option {
    Baraja baraja;
    Descarte descarte;
    MovimientoBarajaDescarte(Baraja baraja, Descarte descarte){
        super("Mover de Baraja a Descarte");
        this.baraja = baraja;
        this.descarte = descarte;
    }
    @Override
    public void execute() {
        if (!baraja.empty()) {
            Carta carta = baraja.sacar();
            carta.destapar();
            descarte.poner(carta);
        } else {
            IO io = new IO();
            io.writeln("No hay mas cartas en la baraja");
        }
    }
}