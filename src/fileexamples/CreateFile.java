package fileexamples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("hello.txt");

            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

            FileWriter fw = new FileWriter(file);
            fw.write("Kelvin \n");
            fw.write("Kelvin \n");
            fw.write("Kelvin \n");
            fw.write("Kelvin \n");
            fw.write("Kelvin \n");

//            fw.close();
//            fw.flush();
        } catch (Exception msg) {
            System.out.println("Error occured "+msg);
        } finally {
            System.out.println("Program complete ");
        }
    }
}
