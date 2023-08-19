package current.basicrec;

import java.util.Scanner;

public class CheckPalRec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(checkPal(str,0));
    }

    private static boolean checkPal(String str,int i) {
        if (i >= str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return checkPal(str,i+1);
    }
}
