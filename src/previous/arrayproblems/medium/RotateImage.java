package previous.arrayproblems.medium;

import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr  = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<arr.length/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-j-1];
                arr[i][arr.length-j-1] = temp;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
