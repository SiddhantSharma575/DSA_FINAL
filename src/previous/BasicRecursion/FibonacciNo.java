package previous.BasicRecursion;

import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibN(n));
    }

    private static int fibN(int n) {
        if (n <= 1){
            return  n;
        }
        return fibN(n-1) + fibN(n-2);
    }
}

