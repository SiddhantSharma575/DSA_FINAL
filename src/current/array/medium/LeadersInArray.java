package current.array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        ArrayList<Integer> res= method1(arr,n);
        System.out.println(res);
        System.out.println(printLeadersOptimalForce(arr,n));
    }

    private static ArrayList<Integer> method1(int[] arr, int n) {
        ArrayList<Integer> res  = new ArrayList<>();
        for (int i=0; i<arr.length-1; i++) {
            boolean isValid = true;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isValid = false;
                }
            }
            if (isValid) {
                res.add(arr[i]);
            }
        }
        res.add(arr[n-1]);
        return res;
    }
    public static ArrayList<Integer>
    printLeadersOptimalForce(int[] arr, int n){

        ArrayList<Integer> ans= new ArrayList<>();

        // Last element of an array is always a leader,
        // push into ans array.
        int max = arr[n - 1];

        ans.add(arr[n-1]);

        // Start checking from the end whether a number is greater
        // than max no. from right, hence leader.
        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        Collections.reverse(ans);
        return ans;

    }

}
