package current.array.easy;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int s1 = 0;
        for (int i=1; i<=n; i++){
            s1 += i;
        }
        int s2 = 0;
        for (int i=0; i<arr.length; i++){
            s2 += arr[i];
        }
        System.out.println(s1-s2);
    }
}
