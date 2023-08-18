package current.collect;

import java.util.*;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("sample", 1);
        System.out.println(map.get("sample"));
        Map<Integer, List<Integer>> adj = new HashMap<>();
        adj.computeIfAbsent(1, f -> new ArrayList<>());
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer> entry : entries)
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        // sorted map -> key will be sorted

    }
}
