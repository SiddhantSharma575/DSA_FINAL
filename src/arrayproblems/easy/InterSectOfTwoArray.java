package arrayproblems.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class InterSectOfTwoArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i=0; i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        int[] arr2 = new int[m];
        for (int i=0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        interSect(arr1,arr2);
    }

    private static void interSect(int[] A, int[] B) {

        int i = 0, j = 0; // to traverse the arrays
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) { //if current element in i is smaller
                i++;
            } else if (B[j] < A[i]) {
                j++;
            } else {
                ans.add(A[i]); //both elements are equal
                i++;
                j++;
            }
        }

        for (int k=0; k<ans.size(); k++){
            System.out.print(ans.get(k) + " ");
        }
        System.out.println();
    }
}
