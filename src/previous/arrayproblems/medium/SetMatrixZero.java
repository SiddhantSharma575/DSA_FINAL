package previous.arrayproblems.medium;

import java.util.Scanner;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        setMatrixZero(arr);
//        for(int[] rows  : arr) {
//            for (int ele : rows) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
    }

    // Method -1 using extra space
    private static void setMatrixZero(int[][] arr) {
        int[][] dup = new int[arr.length][arr[0].length];
        for (int i=0; i<dup.length; i++) {
            for (int j=0; j<dup[0].length; j++){
                dup[i][j] = -1;
            }
        }
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    for (int k=0; k<dup[0].length; k++){
                        dup[i][k] = 0;
                    }
                    for (int k=0; k<dup.length; k++){
                        dup[k][j] = 0;
                    }
                }else if (arr[i][j] != 0 && dup[i][j] != 0) {
                    dup[i][j] = arr[i][j];
                }
            }
        }


        for (int i=0; i < dup.length; i++){
            for (int j=0; j<dup[0].length; j++){
                System.out.print(dup[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method -2 optimal Approach
    private static void method2(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        boolean row = false, col = false;
        for (int i=0; i<n; i++) if(arr[i][0] == 0) row = true;
        for (int j=0; j<m; j++) if (arr[0][j] == 0) col = true;

        for (int i=1; i<n; i++) {
            for (int j=1; j<m; j++) {
                if (arr[i][j] == 0) {
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }
        for (int i=1; i<n; i++) {
            if (arr[i][0] == 0) {
                for (int j=0; j<m; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int j=1; j<m; j++) {
            if (arr[0][j] == 0) {
                for (int i=0; i<n; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        if (row) {
            for (int i=0; i<n; i++) {
                arr[i][0] = 0;
            }
        }
        if (col) {
            for (int j=0; j<m; j++) {
                arr[0][j] = 0;
            }
        }
   }
}