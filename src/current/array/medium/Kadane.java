package current.array.medium;

import java.util.Scanner;

public class Kadane {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(method1(arr,n));
        System.out.println(optimal(arr,n));
    }

    private static int method1(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE; // maximum sum

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                // current subarray = arr[i.....j]

                //add the current element arr[j]
                // to the sum i.e. sum of arr[i...j-1]
                sum += arr[j];

                maxi = Math.max(maxi, sum); // getting the maximum
            }
        }

        return maxi;
    }
    private static int optimal(int[] arr, int n){
        int csum = arr[0];
        int osum = arr[0];
        int first=0;
        int second=0;

        for (int i=1; i<arr.length; i++){
            if (csum >= 0) {
                csum += arr[i];
            }else {
                csum = arr[i];
                first=i;
            }
            if (csum > osum) {
                osum = csum;
                second = i;
            }
        }
        for (int i=first; i<=second; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return osum;
    }
}
