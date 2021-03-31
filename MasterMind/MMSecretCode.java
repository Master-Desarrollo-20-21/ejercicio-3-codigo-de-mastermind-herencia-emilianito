class MMSecretCode extends MMCode {

    public MMSecretCode() {
        // TODO, Generate Random Combination
        combination = "orby";
    }

    @Override
    public void print() {
        io.writeln("****");
    }
}