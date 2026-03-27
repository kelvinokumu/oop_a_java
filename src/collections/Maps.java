package collections;
import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 90);
        marks.put("Bob",99);
        marks.put("Charles",78);

        System.out.println(marks.get("Bob"));

        for(var item : marks.entrySet()){
            System.out.println("Key is "+item.getKey());
            System.out.println("Value is "+ item.getValue());
            System.out.println("Key is "+item.getKey() + " Value is "+ item.getValue());
        }

        marks.remove("Charles"); // delete Charles
        System.out.println(marks.get("Charles"));

        boolean flag = marks.containsKey("Alice");
        System.out.println(flag);
    }
}
