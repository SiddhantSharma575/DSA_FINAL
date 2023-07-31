package previous.BasicRecursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int[] extra = new int[n];
//        reverseArray(arr,extra,0);
//        for (int i=0; i<extra.length; i++){
//            System.out.print(extra[i] + " ");
//        }
        reverseArrayM2(arr,0,arr.length-1);
        for (int ele: arr){
            System.out.print(ele + " ");
        }
    }

    private static void reverseArrayM2(int[] arr, int i, int j) {
        if (i > j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseArrayM2(arr,i+1,j-1);
    }

    private static void reverseArray(int[] arr, int[] extra, int i) {
        if(i == arr.length){
            return;
        }
        extra[i] = arr[arr.length-i-1];
        reverseArray(arr,extra,i+1);
    }
}
