package previous.arrayproblems.relevel;

import java.util.Scanner;

public class ArrayIntoSubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t != 0){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<arr.length; i++){
                arr[i] = scn.nextInt();
            }


            t--;
        }
    }
}
