package previous.arrayproblems.easy;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateFromArrray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = remDup(arr);
        for (int i=0; i<k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    private static int remDup(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set){
            arr[j++] = x;
        }
        return k;
    }
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
