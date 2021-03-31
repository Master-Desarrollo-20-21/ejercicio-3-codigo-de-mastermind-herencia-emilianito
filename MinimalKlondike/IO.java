import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void writeln(String s){
        System.out.println(s);
    }
    public void writeln(){
        System.out.println();
    }

    public void write(String s){
        System.out.print(s);
    }

    public String readString(String s){
        String res = "";
        try {
            System.out.println(s);
            res = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("ERROR DE FORMATO");
        }
        return res;
    }

    public int readInt(String s){
        int res = 0;
        try {
            System.out.println(s);
            res = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("ERROR DE FORMATO");
        }
        return res;
    }

}
