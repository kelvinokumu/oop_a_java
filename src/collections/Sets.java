package collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Apple");
        names.add("Coconut");
        names.add("Mango");
        System.out.println("The fruits are "+names);

        names.add("Apple");
        names.add("Banana");
        System.out.println("The fruits are "+names);

        for(String name : names){
            System.out.println(name);
        }
    }
}
