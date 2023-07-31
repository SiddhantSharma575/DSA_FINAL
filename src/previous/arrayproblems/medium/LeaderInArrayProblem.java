package previous.arrayproblems.medium;

import java.util.ArrayList;
import java.util.Scanner;

public class LeaderInArrayProblem {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=arr.length-1; i>=0; i--){
            if ( i == arr.length-1) {
                ans.add(arr[i]);
            }else {
                boolean isGood = true;
                for (int j=i+1; j<arr.length; j++){
                    if (arr[j] > arr[i]) {
                        isGood = false;
                        break;
                    }
                }
                if (isGood) {
                    ans.add(arr[i]);
                }
            }
        }

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }

    public static void printLeadersOptimal(int[] arr, int n) {
        //Choosing the right most element as the maximum
        int max = arr[n - 1];

        System.out.print(arr[n - 1] + " ");

        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }

        System.out.println();
    }
}
