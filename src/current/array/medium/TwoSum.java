package current.array.medium;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int tar  = scn.nextInt();
        int[] res =  twos1(arr,n,tar);
        for (int ele : res){
            System.out.print(ele + " ");
        }
    }

    private static int[] twos1(int[] nums, int n, int target) {
        int[] ans;
        int firstI = 0;
        int secondI = 0;
        int sum = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    firstI = i;
                    secondI = j;
                    break;
                }
            }
        }

        if(sum != 0){
            ans = new int[2];
            ans[0] = firstI;
            ans[1] = secondI;
            return ans;
        }else{
            ans = new int[0];
            return ans;
        }
    }
}
