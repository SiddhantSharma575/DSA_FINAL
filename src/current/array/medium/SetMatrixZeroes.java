package current.array.medium;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroes {
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
//        int[][] matrix =  method1(arr,n,m);
        int[][] matrix = betterOne(arr,n,m);
        for (int[] rows : matrix) {
            for (int ele : rows) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    private static int[][] betterOne(int[][] arr, int n, int m) {
        int[] rows = new int[n];
        int[] cols = new int[m];
        Arrays.fill(rows,0);
        Arrays.fill(cols,0);
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++) {
                if (rows[i] == 1 || cols[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
     }

    private static int[][] method1(int[][] arr, int n, int m) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr,n,m, i);
                    markCol(arr,n,m,j);
                }
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;

    }

    private static void markCol(int[][] arr, int n, int m, int j) {
        for (int i=0; i<n; i++){
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    private static void markRow(int[][] arr, int n, int m, int i) {
        for (int j=0; j<m; j++){
            if (arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }


}
