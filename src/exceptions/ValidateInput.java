package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("The name is "+name);

        int num = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Enter a number ");
                num = sc.nextInt();
                valid = true;
            } catch(InputMismatchException msg){
                System.out.println(msg);
                System.out.println("Error : Enter a valid number ");
                sc.next(); // clear the incorrect input
            }
        }
        System.out.println("The number is "+num);
    }
}
