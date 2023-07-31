package previous.arrayproblems.easy;

import java.util.Scanner;

public class SearchMatrix {
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
        int target = scn.nextInt();
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                if (arr[i][j] == target){
                    System.out.println(true);
                    break;
                }
            }
        }
        System.out.println(false);

        // optimal
        int i = 0;
        int j = arr[0].length-1;
        while (i < arr.length && j >= 0 ){
            if (arr[i][j] == target){
                System.out.println(true);
            }
            if (arr[i][j] > target){
                j--;
            }else {
                i++;
            }
        }
        System.out.println(false);

    }
}
