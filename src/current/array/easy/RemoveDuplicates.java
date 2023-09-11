package current.array.easy;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        removeDuplicates(arr);
        for (int ele : arr){
            System.out.print(ele  + " ");
        }
    }

    private static void removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

    }
}
