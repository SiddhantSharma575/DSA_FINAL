package current.array.medium;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubArrayWitkK {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(method1(arr,n,k));
        System.out.println(optimal1(arr,n,k));
    }

    private static int optimal1(int[] arr, int n, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;

        for (int i=0; i<n; i++) {
            sum += arr[i];
            int remainingSum = sum - k;
            if (map.containsKey(remainingSum)) {
                count += map.get(remainingSum);
            }
            map.put(sum,map.getOrDefault(sum,0) + 1);
        }

        return count;
    }

    private static int method1(int[] arr, int n, int k) {
        int count = 0;

        for (int i=0; i<n; i++) {
            int curr = 0;
            for (int j=i; j<n; j++){
                curr += arr[j];
                if (curr == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
