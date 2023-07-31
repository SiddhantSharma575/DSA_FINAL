package previous.arrayproblems.easy;

import java.util.Scanner;

public class RowWithMax1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        System.out.println(rowWithMaxOnes(mat,n,m));
    }

    private static int rowWithMaxOnes(int[][] mat, int n, int m) {
        int maxOneCount = 0;
        int maxRowIndex = -1;
        for (int i=0; i<n; i++){
            int firstOneIndex = searchFirstOne(mat[i],0,m-1);
            int rowMCount = m - firstOneIndex;
            if (firstOneIndex != -1 && rowMCount > maxOneCount){
                maxOneCount = rowMCount;
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }

    private static int searchFirstOne(int[] x, int l, int r) {
        if (l <= r){
            int mid = l + (r-1)/2;
            if ((x[mid-1] == 0 || mid == 0) && x[mid] == 1){
                return mid;
            }
            else if (x[mid] == 0){
                return searchFirstOne(x,mid+1,r);
            }else {
                return searchFirstOne(x,l,mid-1);
            }
        }
        return -1;
    }
}
