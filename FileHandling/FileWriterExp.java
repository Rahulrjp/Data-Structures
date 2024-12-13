package FileHandling;

import java.io.IOException;
import java.io.FileWriter;

public class FileWriterExp {
    public static void main(String[] args) {
        try(FileWriter fr = new FileWriter("src/FileHandling/input.txt")){
            fr.write("Hello ! ");
            fr.append("My name is Rahul Vishwakarma");
            fr.append("package FileHandling;\n" +
                    "\n" +
                    "import java.io.IOException;\n" +
                    "import java.io.OutputStream;\n" +
                    "import java.io.OutputStreamWriter;\n" +
                    "\n" +
                    "public class OutputStreamWriterExp {\n" +
                    "    public static void main(String[] args) {\n" +
                    "//        OutputStream ops = System.out;\n" +
                    "//        try (ops){\n" +
                    "//            ops.write(67);\n" +
                    "//            ops.write(43);\n" +
                    "//            ops.write(10);\n" +
                    "//            ops.write(52);\n" +
                    "//        }\n" +
                    "//        catch (IOException e){\n" +
                    "//            System.out.println(e.getMessage());\n" +
                    "//        }\n" +
                    "\n" +
                    "        //OutputStreamWriter\n" +
                    "\n" +
                    "        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){\n" +
                    "            osw.write(67);\n" +
                    "            osw.write(34);\n" +
                    "            osw.write(10);\n" +
                    "            osw.write(45);\n" +
                    "        }\n" +
                    "        catch (IOException e){\n" +
                    "            System.out.println(e.getMessage());\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n");
            fr.append("\nGreat");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
