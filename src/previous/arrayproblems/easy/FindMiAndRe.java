package previous.arrayproblems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindMiAndRe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=1; i<=n; i++) {
            map.put(i,0);
        }
        for (int i=0; i< arr.length; i++){
            map.put(arr[i], map.get(arr[i]) + 1);
        }
        for (Map.Entry<Integer,Integer> entry  : map.entrySet()){
            if (entry.getValue() == 2){
                ans.add(entry.getKey());
            }
            if (entry.getValue() == 0) {
                ans.add(entry.getKey());
            }
        }

        for (int ele : ans) {
            System.out.print(ele + " ");
        }

    }
}
