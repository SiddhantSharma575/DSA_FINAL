package current.array.medium;

import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(method1(arr,n));
        System.out.println(optimalOne(arr,n));
    }

    private static int  method1(int[] arr, int n) {
        int maxProf = -1;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[j] - arr[i] > maxProf) {
                    maxProf = arr[j] - arr[i];
                }
            }
        }
        return  maxProf;
    }
    private static int optimalOne(int[] arr, int n) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] < lsf) {
                lsf = arr[i];
            }
            pist = arr[i] - lsf;
            op = Math.max(op, pist);
        }
        return op;
    }
}
