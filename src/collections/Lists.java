package collections;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Brian");
        names.add("Cate");

        System.out.println("The names are :"+names);

        for(String name : names){
            System.out.println("Add something  "+name);
        }

        System.out.println(names.get(1));
        System.out.println("The size is "+names.size());

        System.out.println("Get the last name "+names.get(2));
        System.out.println("Get the last name "+names.get(names.size()-1)); // will always give me last index

        names.set(0,"Ann"); // replace
        System.out.println("The names are :"+names);

        names.add(1,"Sean"); // add at a specific index
        System.out.println("The names are :"+names);

        names.remove("Brian");
        names.remove(0);

    }
}
