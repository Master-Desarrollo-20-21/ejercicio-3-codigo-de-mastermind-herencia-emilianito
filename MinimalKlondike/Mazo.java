abstract public class Mazo {
    Carta[] cartas;
    int size = 0;
    String title;

    Mazo(String title){
        this.title = title;
        cartas = new Carta[52];
    }

    public Carta sacar(){
        assert !empty();
        size--;
        return cartas[size];
    }

    public void poner(Carta carta){
        assert carta != null;
        assert !full();
        cartas[size] = carta;
        size++;
    }

    public boolean full(){
        return size == 52;
    }

    public boolean empty(){
        return size == 0;
    }

    public void print(){
        IO io = new IO();
        io.write(title + ":");
        if (size > 0) {
            show();
        }else{
            io.writeln( "<EMPTY>");
        }
    }

    public Carta getLastCarta(){
        assert !empty();
        return cartas[size - 1];
    }

    public abstract void show();

}
