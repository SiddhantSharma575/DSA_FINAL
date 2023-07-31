package previous.oops;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        if(n % 2 == 0) {
            System.out.println(sumCalc(n,5));
        }else {
            System.out.println(sumCalc(n,10));
        }

    }

    public static int  sumCalc(int n , int count) {
        int sum = 0;
        int curr = n + 2;
        for (int i=0; i<count; i++) {
            sum += curr;
            curr = curr + 2;
        }
        return sum;
    }
}
