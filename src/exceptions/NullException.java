package exceptions;

public class NullException {
    public static void main(String[] args){
        String name = null;

        try {
            System.out.println(name.length());
        } catch(Exception e){
            System.out.println(e);
        }

        System.out.println("End of the program"); // end of program
    }
}
