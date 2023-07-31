package previous.collections;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Siddhant", 10);
        map.put("Aditya", 20);
        map.put("Naitik", 49);

        for (Map.Entry<String,Integer> mt : map.entrySet()){
            System.out.println("Name : " + mt.getKey() + ", Marks : " + mt.getValue());
        }
    }
}
