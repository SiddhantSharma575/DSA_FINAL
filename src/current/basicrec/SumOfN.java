package current.basicrec;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int sum = 0;
        System.out.println(sumN(sum,n));
    }
    private static int sumN(int sum, int n) {
        if (n == 0)
            return sum;
        return sumN(sum+n,n-1);
    }

}
