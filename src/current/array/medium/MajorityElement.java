package current.array.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int count = n/2;
        Map<Integer,Integer> mp = new HashMap<>();
        for (int j : arr) {
            mp.put(j, mp.getOrDefault(j, 0) + 1);
        }
        int ele = -1;
        for (Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            if (entry.getValue() >= count) {
                ele = entry.getKey();
            }
        }
        System.out.println(ele);
        System.out.println(optimalSolution(arr));
    }

    private static int optimalSolution(int[] arr) {
        int ele = -1;
        int count = 0;
        for (int j : arr) {
            if (count == 0) {
                ele = j;
                count++;
            } else {
                count--;
            }
        }
        int oc = 0;
        for (int val : arr) {
            if (val == ele){
                oc++;
            }
        }
        if (oc > arr.length/2) {
            return ele;
        }else  {
            return -1;
        }
    }

}
