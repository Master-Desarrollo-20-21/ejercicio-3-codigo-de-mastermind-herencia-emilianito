class MMHistoryItem {
    MMCode code;
    MMWBResponse wb;
    IO io;
    MMHistoryItem(MMCode code, MMWBResponse wb){
        this.code = code;
        this.wb = wb;
        io = new IO();
    }

    public String toString (){
        return code.toString() + " " + wb.toString();
    }
}