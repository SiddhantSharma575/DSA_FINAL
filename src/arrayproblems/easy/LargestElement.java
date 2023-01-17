package arrayproblems.easy;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int ele : arr){
            if (ele > max) {
                max = ele;
            }
        }
        System.out.println(max);
    }
}
