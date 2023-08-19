package current.basichash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountArrayFreq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            mp.put(arr[i],mp.getOrDefault(arr[i],0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countMax = 0;
        int countMin = Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            if (entry.getValue() < countMin){
                min = entry.getKey();
                countMin = entry.getValue();
            }
            if (entry.getValue() > countMax) {
                max = entry.getKey();
                countMax = entry.getValue();
            }
        }
        System.out.println("MAX VALUE "+ max);
        System.out.println("MIN VALUE "+ min);

    }
}
