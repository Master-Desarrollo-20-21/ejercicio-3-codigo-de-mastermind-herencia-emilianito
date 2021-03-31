public abstract class Option {
    String title;
    public abstract void execute();
    Option(String title){
        this.title = title;
    }
    public void printOption(int i){
        IO io = new IO();
        io.writeln(i + " - " + title);
    }
}