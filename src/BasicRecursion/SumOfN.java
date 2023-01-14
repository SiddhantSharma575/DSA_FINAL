package BasicRecursion;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(sumN(n,0));
    }

    private static int sumN(int n, int os) {
        if (n == 0){
            return os;
        }
        return os + sumN(n-1,n);
    }
}
