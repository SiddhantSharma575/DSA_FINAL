package previous.arrayproblems.medium;

import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max =  Integer.MIN_VALUE;
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] < arr[j] && arr[j] - arr[i] > max) {
                    max = arr[j] - arr[i];
                }
            }
        }
        System.out.println(max);
    }
    static int maxProfit(int[] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }
}
