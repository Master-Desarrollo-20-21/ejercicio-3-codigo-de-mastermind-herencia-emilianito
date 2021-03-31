public class Klondike {
    Baraja baraja;
    Descarte descarte;
    Palo[] palos;
    Columna[] columnas;
    Menu menu;

    Klondike(){
        menu = new Menu();
        baraja = new Baraja();
        descarte = new Descarte();
        palos = new Palo[4];
        columnas = new Columna[7];
        for (int i = 0; i < palos.length; i++){
            palos[i] = new Palo(i);
        }
        for (int i = 0; i < columnas.length; i++){
            columnas[i] = new Columna(i, baraja);
        }
        menu.add(new MovimientoBarajaDescarte(baraja, descarte));
        menu.add(new MovimientoDescarteBaraja(baraja, descarte));
        menu.add(new MovimientoDescartePalo(descarte, palos));
        menu.add(new MovimientoDescarteColumna(descarte, columnas));
    }

    void jugar(){
        Option selectedOption;
        do {
            printState();
            selectedOption = menu.showMenu();
            selectedOption.execute();
        } while (!menu.isFinished());
    }

    private void printState() {
        baraja.print();
        descarte.print();
        for (Palo palo: palos){
            palo.print();
        }
        for (Columna columna: columnas){
            columna.print();
        }
    }

    public static void main(String[] args){
        new Klondike().jugar();
    }
}
