package arrayproblems.medium;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        // Step 1. Find break point, traverse from back and find the index i whose value is less than i+1
        // Step 2. if breakpoint i is found , than again traverse from back in the right side of i , find jth index where a[j] <= a[i]
        // Step 3. swap i,j
        // Step 4. reverse array from i+1 to a.length
        nextPermuation(arr);
    }

    private static void nextPermuation(int[] arr) {
        if(arr == null || arr.length <= 1 ) return;
        int i = arr.length-2;
        while (i >= 0 && arr[i] >= arr[i+1]) i--;
        if (i >= 0) {
            int j = arr.length-1;
            while (arr[j] <= arr[i]) j--;
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
