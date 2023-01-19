package arrayproblems.medium;

import java.util.Scanner;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sortArray(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    private static void sortArray(int[] arr) {
        int lo = 0;
        int mid = 0;
        int hi = arr.length-1;
        while (mid <= hi){
            switch (arr[mid]){
                case 0:
                    swap(arr,lo,mid);
                    mid++;
                    lo++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,hi);
                    hi--;
                    mid++;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
