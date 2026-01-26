package week3;

import java.util.Scanner;

public class GetInputs {
    public static void main(String[] args){
        // getName();

        int n = getSum(147, 258);
        System.out.println("The main function result "+n);

        // System.out.println("The main function result "+getSum(14,25));
    }

    public static void getName(){
        Scanner sc = new Scanner(System.in); // create an object to the class
        
        System.out.println("Enter a number ");
        int num = sc.nextInt();               // getting input
        System.out.println("The num is "+num);   // display/write

        // BufferReader br = new BufferReader(new InputStreamReader(System.in));
    }
    
    public static int getSum(int firstNum, int secondNum){
        int result = firstNum + secondNum;
        return result;
    }
}
