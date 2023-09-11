package current.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(largestElement(arr));
        System.out.println(secondLarget(arr));
    }

    private static int secondLarget(int[] arr) {
//        Arrays.sort(arr);
//        return arr[arr.length-2];
         int firstLargest = largestElement(arr);
         int secondLargest = Integer.MIN_VALUE;
         for (int ele  : arr) {
             if (ele > secondLargest && ele  < firstLargest) {
                 secondLargest = ele;
             }
         }
         return secondLargest;
    }

    private static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele  : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }
}
