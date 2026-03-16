package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWrit {
    public static void main(String[] args) throws IOException {
        String[] names = {"ouma", "kelvin", "okumu"};

        FileWriter fr = new FileWriter("src/exceptions/text.txt");
        for (String name : names){
            fr.write(name + "\n");
        }
//        fr.close();
        fr.flush();
    }
}
