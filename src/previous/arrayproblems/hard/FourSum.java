package previous.arrayproblems.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        List<List<Integer>> res = solve(arr);
        System.out.println(res);
    }

    private static List<List<Integer>> solve(int[] arr) {
        List<List<Integer>> ans  = new ArrayList<>();
        int target = 0;
        if (arr.length < 4) {
            return ans;
        }
        int n = arr.length;
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            int target_3 = target - arr[i];
            for (int j=i+1; j<n; j++) {
                int target_2 = target_3 - arr[j];
                int front = j+1;
                int back = n-1;
                while (front < back) {
                    int two_sum = arr[front] + arr[back];
                    if (two_sum < target_2) {
                        front++;
                    }else if (two_sum > target_2) {
                        back--;
                    }else  {
                        List<Integer> curr = new ArrayList<>();
                        curr.add(arr[i]);
                        curr.add(arr[j]);
                        curr.add(arr[front]);
                        curr.add(arr[back]);
                        ans.add(curr);


                        // Processing the duplicates of number 3
                        while (front < back && arr[front] == curr.get(2)) ++front;

                        // Processing the duplicates of number 4
                        while (front < back && arr[back] == curr.get(3)) --back;
                    }
                }
            }
        }
        return ans;
    }
}
