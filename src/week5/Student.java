package week5;

public class Student extends Person {
    private String admnNumber;
    private int age;

    public Student(String name, String email, String admnNumber, int age){
        super(name, email);           // initialize
        this.admnNumber = admnNumber; // initialize
        setAge(age);                  // validation
    }

    public void setAge(int age){
        if(age > 17){
            this.age = age;
        } else {

        }
    }

    public void Enroll(){
    }

    public static void ChangeCourse(){
        System.out.println("Changing Course");
    }
}