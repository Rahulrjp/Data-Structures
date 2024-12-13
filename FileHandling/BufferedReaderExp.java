package FileHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;

public class BufferedReaderExp {
    public static void main(String[] args) {

        //Byte to char stream and then reading char Stream
        //using InputStreanReader as constructor argument

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try(br){
            System.out.println("You Typed : " + br.readLine());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        //using FileReader as Constructor argument

        try(BufferedReader br2 = new BufferedReader(new FileReader("src/FileHandling/input.txt"));){
                System.out.println(br2.readLine());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
