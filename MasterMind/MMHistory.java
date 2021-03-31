import java.util.ArrayList;
import java.util.List;

class MMHistory{

    List<MMHistoryItem> his;
    IO io;

    MMHistory() {
        io = new IO();
        his = new ArrayList<>();
    }

    void print(){
        for (MMHistoryItem item: his){
            io.writeln(item.toString());
        }
    }

    public void add(MMCode code, MMWBResponse wb) {
        his.add(new MMHistoryItem(code, wb));
    }

    public void clear() {
        his.clear();
    }
}