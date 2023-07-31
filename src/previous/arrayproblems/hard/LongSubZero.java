package previous.arrayproblems.hard;

import java.util.HashMap;
import java.util.Scanner;

public class LongSubZero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        // naive approach
        sovle1(arr,n);

        // Optimized Approach
        solve2(arr,n);

    }

    private static void solve2(int[] arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i  = -1;
        int sum = 0;
        int maxlen = 0;
        map.put(sum,i);
        while (i < arr.length-1) {
            i++;
            sum += arr[i];
            if (!map.containsKey(sum)) {
                map.put(sum,i);
            }else {
                int len = i - map.get(sum);
                if (len > maxlen) {
                    maxlen = len;
                }
            }
        }
        System.out.println(maxlen);
    }

    private static void sovle1(int[] arr, int n) {
        int max = 0;
        for (int i=0; i<arr.length; i++) {
            int sum = 0;
            for (int j=i; j<arr.length; j++){
                sum += arr[j];
                if (sum == 0) {
                    max = Math.max(max,j-i+1);
                }
            }
        }
        System.out.println(max);
    }
}
