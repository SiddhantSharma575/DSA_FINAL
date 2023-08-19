package current.basicrec;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        count(0,n);
    }

    private static void count(int i,int n) {
        if (i > n) return;
        System.out.println(i);
        count(i+1,n);
    }
}
