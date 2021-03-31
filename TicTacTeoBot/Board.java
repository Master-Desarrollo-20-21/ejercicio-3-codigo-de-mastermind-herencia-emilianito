import java.util.ArrayList;
import java.util.List;

public class Board {
    private char[][] tokens;

    Board(){
        tokens = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                tokens[i][j] = '_';
            }
        }
    }

    public boolean complete(){
        int c = 0;
        for (int contRow = 0; contRow < 3; contRow++){
            for (int contCol = 0; contCol < 3; contCol++){
                if(tokens[contRow][contCol] != '_'){
                    c++;
                }
            }
        }
        return c == 6;
    }

    public List<Coord> getCoordsAvailable(){
        List<Coord> coords = new ArrayList<>();
        for (int contRow = 0; contRow < 3; contRow++){
            for (int contCol = 0; contCol < 3; contCol++){
                if(tokens[contRow][contCol] == '_'){
                    coords.add(new Coord(contRow, contCol));
                }
            }
        }
        return coords;
    }

    public List<Coord> getCoordsOcupadas(char color){
        List<Coord> coords = new ArrayList<>();
        for (int contRow = 0; contRow < 3; contRow++){
            for (int contCol = 0; contCol < 3; contCol++){
                if(tokens[contRow][contCol] == color){
                    coords.add(new Coord(contRow, contCol));
                }
            }
        }
        return coords;
    }


    public boolean existTTT(){
        return this.existTTT('x') || this.existTTT('o');
    }

    public boolean existTTT(char token){
        if(tokens[1][1] == token) {
            if(tokens[0][0] == token){
                return tokens[2][2] == token;
            }
            if(tokens[0][2] == token){
                return tokens[2][0] == token;
            }
            if(tokens[0][1] == token){
                return tokens[2][1] == token;
            }
            if(tokens[1][0] == token){
                return tokens[1][2] == token;
            }
            return false;
        }

        if(tokens[0][0] == token) {
            if(tokens[0][1] == token){
                return tokens[0][2] == token;
            }
            if(tokens[1][0] == token){
                return tokens[2][0] == token;
            }
            return false;
        }

        if(tokens[2][2] == token) {
            if(tokens[1][2] == token){
                return tokens[0][2] == token;
            }
            if(tokens[2][1] == token){
                return tokens[2][0] == token;
            }
            return false;
        }

        return false;
    }

    public boolean empty(Coord coord){
        return full(coord, '_');
    }

    public boolean full (Coord coord, char token){
        return tokens[coord.getRow()][coord.getCol()] == token;
    }

    public void put(Coord coord, char color){
        tokens[coord.getRow()][coord.getCol()] = color;
    }

    public void remove(Coord coord){
        put(coord, '_');
    }

    public void write(){
        IO io = new IO();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(tokens[i][j] + " ");
            }
            io.writeln();
        }
    }
}
