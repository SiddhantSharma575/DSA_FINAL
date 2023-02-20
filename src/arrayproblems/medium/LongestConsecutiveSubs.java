package arrayproblems.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSubs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(longestConsec(arr));
    }

    private static int longestConsec(int[] arr) {
        if (arr.length == 0) {
            return  0;
        }

        int longst = 1;
        int currst = 1;
        for (int i=1; i<arr.length; i++){
            if (arr[i] == arr[i-1] + 1){
                currst += 1;
            }else {
                longst = Math.max(longst,currst);
                currst = 1;
            }
        }
        return Math.max(longst,currst);
    }
}

