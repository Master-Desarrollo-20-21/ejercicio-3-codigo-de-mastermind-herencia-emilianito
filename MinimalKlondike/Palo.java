public class Palo extends Mazo {
    int palo;
    public Palo(int palo) {
        super("Palo-" + palo);
        this.palo = palo;
    }

    @Override
    public void show() {
        getLastCarta().print();
        IO io = new IO();
        io.writeln();
    }

    public boolean apilable(Carta carta) {
        assert carta != null;
        if(empty() && carta.esAs()){
            return true;
        }
        if(!empty() && carta.isSamePalo(carta) && carta.isConsecutive(getLastCarta())){
            return true;
        }
        return false;
    }
}
