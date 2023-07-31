package previous.arrayproblems.medium;

import java.util.ArrayList;
import java.util.Scanner;

public class ReArrangeArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int[] ans = reArrange(arr);
        for (int ele : ans){
            System.out.print(ele + " ");
        }
    }

    private static int[] reArrange(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int ele : arr) {
            if (ele < 0) {
                neg.add(ele);
            }else {
                pos.add(ele);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        boolean posS = true;
        int i=0;
        int j=0;
        while (i<pos.size() || j < neg.size()){
           if (posS){
               ans.add(pos.get(i));
               i++;
               posS = false;
           }else {
               ans.add(neg.get(j));
               j++;
               posS = true;
           }
        }

        int[] res = new int[arr.length];
        for (int k=0; k<ans.size(); k++){
            res[k] = ans.get(k);
        }
        return res;
    }
}
