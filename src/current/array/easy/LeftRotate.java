package current.array.easy;

import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
//        leftRotByk(arr,k);
        rightRotByK(arr,k);
        for (int ele : arr) {
            System.out.print(ele +  " ");
        }
    }

    private static void rightRotByK(int[] arr, int k) {
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    private static void leftRotByk(int[] arr, int k) {
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    private static void reverse(int[] arr, int low, int high) {
        int i=low;
        int j=high;
        while (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
