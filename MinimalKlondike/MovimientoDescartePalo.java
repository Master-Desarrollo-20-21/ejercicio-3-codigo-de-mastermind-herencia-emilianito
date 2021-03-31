public class MovimientoDescartePalo extends Option {
    Descarte descarte;
    Palo[] palos;
    MovimientoDescartePalo(Descarte descarte, Palo[] palos){
        super("Mover de Descarte a Palo");
        this.descarte = descarte;
        this.palos = palos;
    }
    @Override
    public void execute() {
        IO io = new IO();
        int selectedPalo = io.readInt("A que palo? [0-3]");
        Palo palo = palos[selectedPalo];
        if(!descarte.empty()){
            Carta carta = descarte.sacar();
            if (palo.apilable(carta)) {
                palo.poner(carta);
            } else {
                descarte.poner(carta);
                io.writeln("No se puede poner ahi");
            }
        } else {
            io.writeln("No hay cartas para mover");
        }
    }
}