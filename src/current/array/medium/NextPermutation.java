package current.array.medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = optimal(arr,n);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }

    private static int[] optimal(int[] arr, int n) {
        int[] ans = new int[n];
        if (arr == null || arr.length < 1) {
            return ans;
        }
        int idx = -1;
        for (int i=n-2; i>=0; i--){
            if (arr[i] < arr[i+1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            return reverseArr(arr, 0, arr.length-1);
        }
        for (int i=n-1; i>idx; i--){
            if (arr[i] > arr[idx]) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }
        return  reverseArr(arr, idx+1, n-1);

    }

    private static int[] reverseArr(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
