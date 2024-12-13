package FileHandling;

import java.io.*;

public class BufferedWriterExp {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/FileHandling/input2"))){
            bw.write("My name is Rahul");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
