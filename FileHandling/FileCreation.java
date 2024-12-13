package FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileCreation {
    public static void main(String[] args) {
        try{
        File obj = new File("src/FileHandling/photo.jpg");
        obj.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileWriter fw = new FileWriter("src/FileHandling/newFile.txt")){
            fw.write("I am a Software Developer");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
