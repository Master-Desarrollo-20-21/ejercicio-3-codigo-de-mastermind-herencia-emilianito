public class Coord {
    private int row;
    private int col;

    Coord(int row, int col){
        this.row = row;
        this.col = col;
    }

    Coord(){}
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void read(String title){
        IO io = new IO();
        io.writeln(title);
        row = new LimitedIntDialog("Fila? ", 1, 3).read()-1;
        col = new LimitedIntDialog("Columna? ", 1, 3).read()-1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coord coord = (Coord) o;
        return row == coord.row &&
                col == coord.col;
    }

}
