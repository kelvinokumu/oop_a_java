package week4;

import java.util.Scanner;

public class Student {

    static Scanner sc = new Scanner(System.in);
    public Student(){
        System.out.println("First");
    }
    
    public Student(String name, int age){
        System.out.println("Second");
    }

    public Student(int age, String name){
        System.out.println("Third");
    }

    public void display1(){
        String name = sc.nextLine();
        System.out.println("Display something");
    }

    public void display2(){
        
        String name2 = sc.nextLine();
        System.out.println("Display something");
    }
}
