package previous.arrayproblems.easy;

import java.util.Scanner;

public class RotateByKElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
//        leftRotateByK(arr,k);
        rightRotate(arr,k);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    private static void rightRotate(int[] arr, int k) {
        fullRotate(arr,0, arr.length-k-1);
        fullRotate(arr,arr.length-k,arr.length-1);
        fullRotate(arr,0,arr.length-1);
    }

    private static void leftRotateByK(int[] arr, int k) {
        fullRotate(arr,0, arr.length-k-1);
        fullRotate(arr,arr.length-k,arr.length-1);
        fullRotate(arr,0,arr.length-1);
    }
    private static void fullRotate(int[] arr, int start, int end) {
         while (start < end){
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
    }
}
