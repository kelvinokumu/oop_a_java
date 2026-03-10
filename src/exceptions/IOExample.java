package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            Scanner sc = new Scanner(new FileReader("src/exceptions/text.txt"));
            System.out.println(sc.nextLine());

//        Scanner sc =  new Scanner(System.in); // input from keyboard
        } catch(Exception msg){
            System.out.println("The error is " +msg);
    }
        finally{
//            sc.close();
            System.out.println("Must run");
        }
    }
}
