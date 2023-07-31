package previous.BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencies {
    public static void main(String[] args) {
        int[] arr  = {10,5,10,15,10,5};
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int ele : arr) {
            if (!freqMap.containsKey(ele)){
                freqMap.put(ele,1);
            }else {
                freqMap.put(ele, freqMap.get(ele) + 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + " Occurs " + entry.getValue() + " times ");
        }
    }
}
