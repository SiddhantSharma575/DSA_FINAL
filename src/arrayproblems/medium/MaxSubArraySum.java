package arrayproblems.medium;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> subArray = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i=0; i<=arr.length-1; i++){
            for (int j=i; j<=arr.length-1; j++){
                int sum = 0;
                for (int k=i; k<=j; k++){
                    sum += arr[k];
                }
                if (sum > max) {
                    subArray.clear();
                    max = sum;
                    subArray.add(i);
                    subArray.add(j);
                }
            }
        }

        System.out.println(max);
        for (int i=subArray.get(0); i<=subArray.get(1); i++){
            System.out.print(arr[i] + " ");
        }
    }

    // Kadane Algo
    public static int maxSubArray(int[] nums,ArrayList<Integer> subarray) {
        int msf=Integer.MIN_VALUE , meh=0 ;
        int s=0;
        for(int i=0;i<nums.length;i++){
            meh+=nums[i];

            if(meh>msf)
            {
                subarray.clear();
                msf=meh;
                subarray.add(s);
                subarray.add(i);
            }
            if(meh<0)
            {
                meh=0;
                s=i+1;

            }
        }

        return msf;
    }
}
