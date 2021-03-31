public class Descarte extends Mazo {

    Descarte(){
        super("Descarte");
    }

    @Override
    public void show(){
        getLastCarta().print();
        IO io = new IO();
        io.writeln();
    }

}
