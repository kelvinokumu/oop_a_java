package week5;

public class Main {
    public static void main(String[] args){
        System.out.println("Start");
        
        Student.ChangeCourse(); // static method called using classname

        Student st1 = new Student("Brian","brian@gmail.com","DBT123",145);
        
        String studentname = st1.getName();  //calling a method from a variable
        System.out.println("Student name is "+studentname);

        System.out.println("Student email is "+st1.getEmail());

        Lecturer l1 = new Lecturer("Kelvin","kelvin@gmail.com");
        System.out.println("Lec email is " +l1.getEmail());


        // st1.Enroll(); // non-static method called using object


        Person p1 = new Person("new Person","p1@gmail.com");
    }
}
