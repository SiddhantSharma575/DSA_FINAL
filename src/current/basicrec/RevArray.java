package current.basicrec;


import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        reverseArr(arr,0,n-1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    private static void reverseArr(int[] arr, int i, int j) {
        if (i == j)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseArr(arr,i+1,j-1);
    }
}
