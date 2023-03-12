package arrayproblems.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = n/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            }else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer,Integer> mp : map.entrySet()) {
            if (mp.getValue() > k) {
                ans.add(mp.getKey());
            }
        }
        System.out.println(ans);
     }
}
