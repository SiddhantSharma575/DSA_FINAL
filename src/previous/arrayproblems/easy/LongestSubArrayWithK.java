package previous.arrayproblems.easy;

import java.util.Scanner;

public class LongestSubArrayWithK {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(longestSubArrWithSumK_BF(arr,n,k));
    }
    public static int longestSubArrWithSumK_BF(int[] arr, int n, int k) {
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k)
                    maxLength = Math.max(maxLength, (j - i + 1));
            }

        }
        return maxLength;
    }

    public static int longestSubArrWithSumK_Optimal(int[] arr, int n, int k) {
        int start = 0, end = -1, sum = 0, maxLength = 0;
        while (start < n) {
            while ((end + 1 < n) && (sum + arr[end + 1] <= k))
                sum += arr[++end];

            if (sum == k)
                maxLength = Math.max(maxLength, (end - start + 1));

            sum -= arr[start];
            start++;
        }
        return maxLength;
    }
}
