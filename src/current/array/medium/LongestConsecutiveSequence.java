package current.array.medium;

import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(method1(arr,n));
        // pepcoding
        System.out.println(optimal(arr,n));
    }

    private static int optimal(int[] arr, int n) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int val : arr) {
            map.put(val,true);
        }
        for (int val : arr) {
            if (map.containsKey(val-1)){
                map.put(val,false);
            }
        }
        int msp=0;
        int ml=0;
        for (int val : arr) {
            if (map.get(val)) {
                int tl = 1;
                int tsp = val;
                while (map.containsKey(tsp + tl)){
                    tl++;
                }
                if (tl > ml){
                    msp = tsp;
                    ml = tl;
                }
            }
        }
        return ml;
    }

    private static int method1(int[] arr, int n) {
        int longestSeq = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            int curr = arr[i];
            int count = 1;
            while (linearSearch(arr, curr + 1)){
                curr += 1;
                count += 1;
            }
            longestSeq = Math.max(count,longestSeq);
        }
        return longestSeq;
    }

    private static boolean linearSearch(int[] arr, int ele) {
        for (int val : arr) {
            if (val == ele) {
                return  true;
            }
        }
        return  false;
    }
}
