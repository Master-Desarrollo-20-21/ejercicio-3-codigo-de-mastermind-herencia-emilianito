public class MovimientoDescarteColumna extends Option {

    Descarte descarte;
    Columna[] columnas;

    MovimientoDescarteColumna(Descarte descarte, Columna[] columnas) {
        super("Mover de Descarte a columna");
        this.descarte = descarte;
        this.columnas = columnas;
    }

    @Override
    public void execute() {
        IO io = new IO();
        int selectedColumna = io.readInt("A que columna? [0-6]");
        Columna columna = columnas[selectedColumna];
        if(!descarte.empty()) {
            Carta carta = descarte.sacar();
            Carta lastCarta = columna.getLastCarta();
            if (!lastCarta.isSameColor(carta) && carta.isPredecetor(lastCarta)){
                columna.poner(carta);
            } else {
                descarte.poner(carta);
                io.writeln("No se puede poner ahi");
            }

        } else {
            io.writeln("No hay mas cartas para mover");
        }
    }
}
