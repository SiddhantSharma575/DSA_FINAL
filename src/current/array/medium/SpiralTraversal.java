package current.array.medium;

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;
        int maxR = n-1;
        int maxC = m-1;
        int cnt = 0;
        int tle = n * m;
        while (cnt < tle) {
            for (int i=minr,j=minc; j<=maxC && cnt < tle; j++) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            minr++;

            for (int i=minr,j=maxC; i<=maxR && cnt < tle; i++) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            maxC--;
            for (int i=maxR,j=maxC; j>=minc && cnt < tle; j--) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            maxR--;
            for (int i=maxR,j=minc; i>=minr && cnt < tle; i--) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            minc++;
        }

    }
}
