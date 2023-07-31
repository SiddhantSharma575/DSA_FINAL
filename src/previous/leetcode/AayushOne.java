package previous.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class AayushOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = new ArrayList<>();
        String str = String.valueOf(n);
        for (int i=1; i<str.length(); i++){
            String first = str.substring(0,2);
            String second = str.substring(2);
            str = second + first;
            ans.add(str);
        }
        for (String curr : ans) {
            System.out.print(Integer.parseInt(curr) + " ");
        }
    }
}
