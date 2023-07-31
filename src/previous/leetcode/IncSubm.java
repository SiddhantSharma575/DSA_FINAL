package previous.leetcode;

import java.util.Scanner;

public class IncSubm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int qr = scn.nextInt();
        int qc = scn.nextInt();
        int[][] queries = new int[qr][qc];
        for (int i=0; i<qr; i++){
            for (int j=0; j<qc; j++){
                queries[i][j] = scn.nextInt();
            }
        }

        int[][] mat = new int[n][n];
        for (int[] query : queries) {
            int row1 = query[0], col1 = query[1], row2 = query[2], col2 = query[3];
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    mat[i][j]++;
                }
            }
        }


        for (int[] rows : mat){
            for (int el :  rows){
                System.out.print(el + " ");
            }
            System.out.println();
        }

    }
}
