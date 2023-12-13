package current.array.medium;

import java.util.Scanner;

public class RotateBy90 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        rotateBy90(arr);

    }

    private static void rotateBy90(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // rotate
        for (int i=0; i<matrix.length; i++) {
            int li = 0;
            int ri = matrix[i].length-1;
            while (li < ri) {
                int temp = matrix[i][li];
                matrix[i][li] = matrix[i][ri];
                matrix[i][ri] = temp;

                li++;
                ri--;
            }
        }

        for (int[] res : matrix) {
            for (int ele : res) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
