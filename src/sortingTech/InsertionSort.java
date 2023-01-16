package sortingTech;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        insertionSort(arr);
        for (int ele: arr){
            System.out.print(ele + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i=1; i<arr.length; i++){
            int current = arr[i];
            int j=i-1;
            while (j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
