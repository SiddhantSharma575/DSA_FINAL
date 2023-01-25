package arrayproblems.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        HashMap<Integer,Integer> cMap = new HashMap<>();
        for (int ele : arr) {
            if (!cMap.containsKey(ele)) {
                cMap.put(ele, 1);
            }else {
                cMap.put(ele, cMap.get(ele) + 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : cMap.entrySet()){
            if (entry.getValue() > n/2) {
                System.out.print(entry.getKey() + " ");
            }

        }
    }

    // Moore voote Algorithm
    int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if(num==candidate) count += 1;
            else count -= 1;
        }

        return candidate;
    }
}
