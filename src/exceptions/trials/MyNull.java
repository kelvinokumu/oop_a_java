package exceptions.trials;

import java.sql.SQLOutput;

public class MyNull {
    public static void main(String[] args) {
        String name = "Kelvin";

        try{
            System.out.println(name.length());
        }
        catch(Exception msg){
            System.out.println(msg);
        }
        System.out.println("After exceptions");
    }
}
