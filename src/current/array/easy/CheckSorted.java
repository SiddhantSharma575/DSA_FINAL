package current.array.easy;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(checkSorted(arr));
    }

    private static boolean checkSorted(int[] arr) {
        boolean isSorted = true;
        int i=0;
        int j=1;
        while (j < arr.length){
            if (arr[j] < arr[i]){
                isSorted = false;
            }
            i++;
            j++;
        }
        return isSorted;
    }
}
