package current.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AllAlgo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
//        selectionSort(arr);
//          bubbleSort(arr);
//        insertionSort(arr);
//        mergeSort(arr,0,arr.length-1);
//        for (int x: arr) {
//            System.out.print(x + " ");
//        }

        quickSort(arr,0,arr.length-1);
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = func(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    private static int func(int[] arr, int low, int high) {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void mergeSort(int[] arr, int low,int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1, high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    private static void insertionSort(int[] arr) {
        int i=1;
        while ( i < arr.length) {
            int j = i;
            while (j > 0) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                j--;
            }
            i++;
        }
    }

    private static void bubbleSort(int[] arr) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    private static void selectionSort(int[] arr) {
        int i=0;
        while (i < arr.length-1) {
            int min = i;
            int j = i+1;
            while(j < arr.length ) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
                j++;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            i++;
        }
    }
}
