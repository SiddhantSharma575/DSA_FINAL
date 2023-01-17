package arrayproblems.easy;

import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        moveZe(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    private static void moveZe(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] == 0){
                for (int j=i+1; j<arr.length; j++){
                    if (arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
    }


    public static void zerosToEnd(int[] arr) {

        //finding first zero occurrence
        int k = 0;
        while (k < arr.length) {
            if (arr[k] == 0) {

                break;
            } else {
                k = k + 1;
            }
        }

        //finding zeros and immediate non-zero elements and swapping them
        int i = k, j = k + 1;

        while (i < arr.length && j < arr.length) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;

            }

            j++;

        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
