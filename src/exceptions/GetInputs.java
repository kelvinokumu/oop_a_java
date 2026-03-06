package exceptions;

import java.util.Scanner;
// import java.util.*;

public class GetInputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //create scanner object
        
        String name;   // declaration
        name = scanner.next();  // assignment

        int num = scanner.nextInt();

        boolean flag = scanner.nextBoolean();

        Double balance = scanner.nextDouble();

        System.out.println("The name is "+name);  // individual print statements
        System.out.println("The number is "+num);

        // multiple outputs on a single print statement
        System.out.println("String is "+name+ "num is "+num+ "flag is" +flag+ "Balance is "+balance);

    }

}
