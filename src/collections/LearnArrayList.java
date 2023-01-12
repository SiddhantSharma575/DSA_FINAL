package collections;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // list allows duplicate value
        list.add("element1");
        list.add("element1");
        list.add("element2");
        System.out.println(list);

        // list allows you to have null value
        list.add(null);
        System.out.println(list);

        // Maintain Insertion Order

    }
}
