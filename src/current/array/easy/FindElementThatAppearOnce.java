package current.array.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindElementThatAppearOnce {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i< arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr,n));
    }

    private static int solution(int[] arr, int n) {
        HashMap<Integer,Integer>  map = new HashMap<>();
        for (int ele  : arr) {
            map.put(ele,map.getOrDefault(ele,0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer,Integer> entry  : map.entrySet()){
            if (entry.getValue() == 1){
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
