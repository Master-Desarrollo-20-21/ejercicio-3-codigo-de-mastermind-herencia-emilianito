public class Carta {
    private int palo;
    private int numero;
    private int color;
    private int position;
    public Carta(int palo, int numero) {
        this.position = 0;
        this.palo = palo;
        this.numero = numero;
        this.color = palo % 2;
    }

    void destapar(){
        position = 1;
    }

    void tapar(){
        position = 0;
    }

    boolean isVisible(){
        return position == 1;
    }

    void print(){
        IO io = new IO();
        if (isVisible()) {
            io.write("[" + palo + "," + numero + "]");
        } else {
            io.write("[?,?]");
        }
    }

    boolean isConsecutive(Carta carta){
        return numero + 1 == carta.numero;
    }

    boolean isPredecetor(Carta carta){
        return numero - 1 == carta.numero;
    }

    boolean isSamePalo(Carta carta){
        return palo == carta.palo;
    }

    boolean isSameColor(Carta carta){
        return palo == carta.color;
    }

    boolean esAs(){
        return this.numero == 0;
    }
}