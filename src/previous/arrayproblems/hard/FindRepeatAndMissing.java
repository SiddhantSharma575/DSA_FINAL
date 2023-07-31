package previous.arrayproblems.hard;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindRepeatAndMissing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i=1; i<=n; i++) {
            mp.put(i, 0);
        }
        for (int i=0; i<arr.length; i++) {
            mp.put(arr[i],mp.get(arr[i]) + 1);
        }
        for (Map.Entry<Integer,Integer> mt : mp.entrySet()) {
            if (mt.getValue() == 0) {
                System.out.println("Missing Number : " + mt.getKey());
            }
            if (mt.getValue() == 2) {
                System.out.println("Repeating Number : " + mt.getKey());
            }
        }
    }
}
