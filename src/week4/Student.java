package week4;

public class Student {
    public Student(){
        System.out.println("First");
    }
    
    public Student(String name, int age){
        System.out.println("Second");
    }

    public Student(int age, String name){
        System.out.println("Third");
    }

    public void display(){
        System.out.println("Display something");
    }
    
}
