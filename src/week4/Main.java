package week4;

public class Main {
    public static void main(String[] args){
        // System.out.println("Start Java");

        // Student st1 = new Student("Dennis", 25);
        // Student st2 = new Student(36, "Dennis");
        // st1.display();

        NewStudent st3 = new NewStudent("Dennis", "Dennis@gmail.com",25, 147852);
        System.out.println(st3.getAge());
        
    }
}
