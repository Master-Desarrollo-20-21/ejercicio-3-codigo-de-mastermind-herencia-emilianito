class MMCode {
    String combination;
    IO io;
    MMCode(){
        io = new IO();
    }

    void ask(){
        do {
            combination = io.readString("Your combination: ");
        } while(!isValid(combination));
    }

    private boolean isValid(String combination){
        return combination.length() == 4;
    }

    MMWBResponse match(MMCode other) {
        int nWhite = 0;
        int nBlack = 0;
        for(int i=0; i<combination.length(); i++){
            for(int j=0; j<other.toString().length(); j++){
                char c1 = combination.charAt(i);
                char c2 = other.toString().charAt(j);
                if(c1==c2 && i == j){
                    nWhite++;
                }
                if (c1==c2 && i != j){
                    nBlack++;
                }
            }
        }
        return new MMWBResponse(nWhite, nBlack);
    }

    @Override
    public String toString() {
        return combination;
    }

    public void print(){
        io.writeln(combination);
    }
}