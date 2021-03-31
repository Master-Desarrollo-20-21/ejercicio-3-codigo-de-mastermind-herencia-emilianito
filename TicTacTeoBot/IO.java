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
    public int readInt(String s){
        boolean ok = false;
        int value = 0;
        do {
            try {
                System.out.println(s);
                value = Integer.parseInt(bufferedReader.readLine());
                ok = true;
            } catch (Exception ex) {
                System.out.println("ERROR DE FORMATO");
            }
        } while(!ok);

        return value;
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

}
