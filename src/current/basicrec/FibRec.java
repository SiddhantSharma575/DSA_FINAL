package current.basicrec;

import java.util.Scanner;

public class FibRec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibc(n));
    }

    private static int fibc(int n) {
        if (n <= 1) {
            return n;
        }
        int first = fibc(n-1);
        int last = fibc(n-2);
        return first + last;
    }
}
