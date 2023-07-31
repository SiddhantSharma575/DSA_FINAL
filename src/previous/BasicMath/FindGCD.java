package previous.BasicMath;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first = scn.nextInt();
        int second = scn.nextInt();
        int min = Math.min(first,second);
        while (min != 1){
            if (first % min == 0 && second % min == 0){
                break;
            }
            min--;
        }
        System.out.println(min);
    }
    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
