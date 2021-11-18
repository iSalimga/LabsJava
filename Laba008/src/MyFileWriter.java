import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;
public class MyFileWriter {
    public static void main (String []arg) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String str = null;
        try { str = reader.readLine();}
        catch (Throwable e){
            str += "";
        }
        try {
            FileWriter writer = new FileWriter("example.txt", false);
            writer.write(str);
            writer.append('\n');
            writer.flush();
            writer.close();
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
        }
        reader.close();
    }
}

