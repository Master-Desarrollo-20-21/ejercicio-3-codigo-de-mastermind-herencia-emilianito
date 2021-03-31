class MMWBResponse {

    int nWhite;
    int nBlack;

    MMWBResponse(int nWhite, int nBlack){
        this.nWhite = nWhite;
        this.nBlack = nBlack;
    }
    public boolean isWinner() {
        return nWhite == 4;
    }

    @Override
    public String toString() {
        return "[nWhite=" + nWhite + ", nBlack=" + nBlack + "]";
    }
}