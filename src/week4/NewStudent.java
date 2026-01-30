package week4;

public class NewStudent {
    private String userName;
    private String userEmail;
    private int userAge;
    private int userNumber;

    public NewStudent(String name, String email, int age, int number){
        this.userName = name;
        this.userEmail = email;
        // this.userAge = age;
        setAge(age);
        this.userNumber = number;
    }

    public void setAge(int age){
        if(age > 17){
            this.userAge = age;
        }
        else {
            System.out.println("Age not correct");
        }
    }
    
    public int getAge(){
        return this.userAge;
    }

    public int getNumber(){
        return this.userNumber;
    }
}
