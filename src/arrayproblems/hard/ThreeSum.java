package arrayproblems.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        //
//        solve1(arr);
        List<List<Integer>> res = solve2(arr);
        System.out.println(res);
    }

    private static List<List<Integer>> solve2(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        if (arr.length < 3) {
            return res;
        }
        // fix ith pointer , iteratre from i+1 to n & check pair sum for target - arr[i]
        // but also check for duplication
        for (int i = 0; i <= arr.length - 3; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int val1 = arr[i];
            int targ = 0-val1;
            List<List<Integer>> subRes = twoSum(arr, i+1, arr.length - 1, targ);
            for (List<Integer> list : subRes) {
                list.add(val1);
                res.add(list);
            }
        }


        return res;
    }

    private static List<List<Integer>> twoSum(int[] arr, int st, int e, int targ) {
        int left = st;
        int right = e;
        List<List<Integer>> res = new ArrayList<>();
        while (left < right) {
            if (left != st && arr[left] == arr[left - 1]) {
                left++;
                continue;
            }
            int sum = arr[left] + arr[right];
            if (sum == targ) {
                List<Integer> curr = new ArrayList<>();
                curr.add(arr[left]);
                curr.add(arr[right]);
                res.add(curr);
                left++;
                right--;
            } else if (sum > targ) {
                right--;
            } else {
                left++;
            }

        }
        return res;
    }

    private static void solve1(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        ArrayList<Integer> curr = new ArrayList<>();
                        curr.add(arr[i]);
                        curr.add(arr[j]);
                        curr.add(arr[k]);

                        if (!ans.contains(curr)) {
                            ans.add(curr);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
