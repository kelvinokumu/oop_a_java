package exceptions;

public class ArrayA {
    public static void main(String[] args){
        System.out.println("Before loop");

        String[] names = {"Alice","Allan","Jane"};
        try{
//            System.out.println(names[0]);
//            System.out.println(names[1]);
//            System.out.println(names[2]);
//            System.out.println(names[3]);  // error

            for(int i = 0; i< names.length ;i++){
            System.out.println(names[i]);
            }
        }
        catch(Exception msg){
            System.out.println("Something is wrong " +msg);
        }


        System.out.println("After loop");
    }
}
