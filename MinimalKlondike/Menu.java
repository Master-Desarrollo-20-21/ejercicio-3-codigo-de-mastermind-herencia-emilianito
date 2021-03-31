public class Menu {

    int size = 0;
    Option[] options;
    private Exit exit;

    Menu(){
        options = new Option[50];
        exit = new Exit();
    }

    void add(Option option){
        options[size] = option;
        size++;
    }

    Option showMenu(){
        add(exit);
        IO io = new IO();
        for (int i=0; i<size; i++) {
            options[i].printOption(i);
        }
        int op = io.readInt("Opcion?");
        return options[op];
    }

    public boolean isFinished(){
        return exit.isFinished();
    }
}
