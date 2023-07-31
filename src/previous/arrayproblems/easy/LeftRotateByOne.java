package previous.arrayproblems.easy;

import java.util.Scanner;

public class LeftRotateByOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int first = arr[0];
        for (int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
