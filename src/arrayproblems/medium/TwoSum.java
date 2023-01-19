package arrayproblems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == tar){
                    ans.add(i);
                    ans.add(j);
                }
            }
        }

        System.out.println(ans);

        // Method-2
        Arrays.sort(arr);
        System.out.println(twoPointMeth(arr,tar));
    }

    private static ArrayList<Integer> twoPointMeth(int[] arr, int tar) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j = arr.length-1;
        while (i < j){
          if (arr[i] + arr[j] == tar) {
              ans.add(i);
              ans.add(j);
              break;
          }
          else if (arr[i] + arr[j] > tar)
              j--;
          else
              i++;
        }

        return ans;
    }
}
