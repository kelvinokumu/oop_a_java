package exceptions;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        // int[] nums = {1,2,3,4,5};

        Scanner scanner = new Scanner(System.in);
        // BufferReader br = new BufferReader(new InputStreamReader(System.in));

        System.out.println("How many names do you want");
        int size = scanner.nextInt();  // size of array

        String[] names = new String[size]; // create array and pass size

        // getting values
        for(int i = 0; i < size; i++){
            System.out.println("Enter the name for index "+i);
            names[i] = scanner.next();
        }

        // display values
        for(int i = 0;i < size;i++){
            System.out.println("The name at index "+i+" is "+names[i]);
        }

        // names[0] = scanner.next();
        // names[1] = scanner.next();
        // names[2] = scanner.next();
        // names[3] = scanner.next();
        // names[4] = scanner.next();
    }

}
