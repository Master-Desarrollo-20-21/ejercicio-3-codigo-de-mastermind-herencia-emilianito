public class LimitedIntDialog {
    String text;
    int limiteInferior;
    int limiteSuperior;
    LimitedIntDialog(String text, int limiteInferior, int limiteSuperior){
        this.text = text;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }
    int read() {
        IO io = new IO();
        int num;
        do {
            num = io.readInt(text);
        } while (num < limiteInferior || limiteSuperior > num);
        return num;
    }
}
