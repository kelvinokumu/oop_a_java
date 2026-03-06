package exceptions;

public class ArrayA {
    public static void main(String[] args){
        System.out.println("Before loop");

        String[] names = {"Alice","Allan","Jane"};

        try{
            for(int i = 0; i<= names.length ;i++){
            System.out.println(names[i]);
        }
        } catch(Exception e){
            System.out.println(e);
        }
        

        System.out.println(" After loop");

    }

}
