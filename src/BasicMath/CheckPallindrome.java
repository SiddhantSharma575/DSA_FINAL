package BasicMath;

import java.util.Scanner;

public class CheckPallindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        System.out.println(isPallindorme(n));
    }

    private static boolean isPallindorme(int n) {
        String str = String.valueOf(n);
        int i=0;
        int j=str.length()-1;
        while (i <= j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
