package current.array.easy;

import java.util.Scanner;

public class LongestSubArrayWithk {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(longSub(arr,n,k));
    }

    private static int longSub(int[] arr, int n, int k) {
        int maxSub = 0;
        for (int i=0; i<arr.length; i++){
            int currmx = 0;
            for (int j=i; j<arr.length; j++){
                currmx += arr[j];
                if(currmx == k){
                    maxSub = Math.max(maxSub,j-i+1);
                }
            }
        }
        return maxSub;
    }
}
