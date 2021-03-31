public class Exit extends Option{
    private boolean finished = false;
    Exit() {
        super("Salir");
    }

    @Override
    public void execute() {
        finished = true;
    }

    public boolean isFinished(){
        return finished;
    }
}
