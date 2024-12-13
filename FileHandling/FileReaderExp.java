package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExp {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("D:/Photos/New folder/AdobeLightroom/998_7327.jpg")){
            int letters = fr.read();
            while (fr.ready()){
                System.out.print((char) letters);
                letters = fr.read();
            }
            fr.close();
            System.out.println();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
/* public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:/Users/rahul/Desktop/four-card-feature-section-master/four-card-feature-section-master/index.html");
        int letters = fr.read();
        while (fr.ready()){
            System.out.print((char) letters);
            letters = fr.read();
        }
    }*/
    }
}
