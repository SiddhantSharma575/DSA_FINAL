package collections;

import java.util.ArrayList;
import java.util.Collection;

public class LearnList {
    public static void main(String[] args) {
        Collection<String> fruitcollection = new ArrayList<>();
        fruitcollection.add("Banana");
        fruitcollection.add("Apple");
        fruitcollection.add("mango");
        System.out.println(fruitcollection);

        // Remove
        fruitcollection.remove("Banana");
        System.out.println(fruitcollection);

        // contains
        boolean isPresent = fruitcollection.contains("Apple");
        System.out.println(isPresent);

        fruitcollection.forEach((element) -> {
            System.out.println(element);
        });
    }
}
