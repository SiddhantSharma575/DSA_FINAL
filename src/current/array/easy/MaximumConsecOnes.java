package current.array.easy;

import java.util.Scanner;

public class MaximumConsecOnes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(maxConcecOnes(arr,n));
    }

    private static int maxConcecOnes(int[] arr, int n) {
        int cnt=0;
        int maxCnt = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            if (arr[i] == 1){
                cnt++;
            }else {
                cnt = 0;
            }
            maxCnt = Math.max(maxCnt,cnt);
        }
        return maxCnt;
    }
}
