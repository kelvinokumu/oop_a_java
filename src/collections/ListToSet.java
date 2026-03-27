package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Brian");
        names.add("Cate");
        names.add("Brian");
        names.add("Cate");

        System.out.println("The names are "+names);

        Set<String> new_names = new HashSet<>(names);  // typecast a list to a set

        System.out.println("New names from set "+new_names);

        List<String> namesfromset = new ArrayList<>(new_names); //typecast a set to a list
        System.out.println(namesfromset);

    }
}
