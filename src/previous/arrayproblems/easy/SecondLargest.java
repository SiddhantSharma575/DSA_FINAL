package previous.arrayproblems.easy;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int ele : arr){
            if (ele > max) {
                max = ele;
            }
        }
        int sMax = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > sMax && ele < max){
                sMax = ele;
            }
        }
        System.out.println(sMax);
        getElements(arr,n);
    }

    static private void getElements(int[] arr, int n)
    {
        if (n == 0 || n==1)
        {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0;i < n;i++)
        {
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }
        for (i = 0;i < n;i++)
        {
            if (arr[i] < second_small && arr[i] != small)
            {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }

        System.out.println("Second smallest is "+second_small);
        System.out.println("Second largest is "+second_large);
    }
}
