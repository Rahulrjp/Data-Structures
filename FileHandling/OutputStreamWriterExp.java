package FileHandling;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExp {
    public static void main(String[] args) {
//        OutputStream ops = System.out;
//        try (ops){
//            ops.write(67);
//            ops.write(43);
//            ops.write(10);
//            ops.write(52);
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        //OutputStreamWriter

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write(67);
            osw.write(34);
            osw.write(10);
            osw.write(45);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
