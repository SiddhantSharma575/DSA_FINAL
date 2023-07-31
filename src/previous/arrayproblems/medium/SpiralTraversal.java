package previous.arrayproblems.medium;

import java.util.Scanner;

public class SpiralTraversal {
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
        printSpiral(arr);

    }

    private static void printSpiral(int[][] mat) {
        int top = 0, left = 0, bottom = mat.length - 1, right = mat[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(mat[top][i] + " ");

            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(mat[i][right] + " ");

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(mat[bottom][i] + " ");

                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(mat[i][left] + " ");

                left++;
            }
        }
    }
}
