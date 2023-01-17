package arrayproblems.easy;

import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        check(arr);
    }

    private static void check(int[] arr) {
        for (int i=1; i<arr.length; i++){
            if (arr[i] < arr[i-1]){
                System.out.println("NOT SORTED");
                return;
            }
        }
        System.out.println("SORTED");
    }
}
