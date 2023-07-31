package previous.arrayproblems.hard;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayWithXorK {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i]  = scn.nextInt();
        }
        int k = scn.nextInt();
        int cunt = countSubWithXorK(arr,k);
        System.out.println(cunt);
    }

    private static int countSubWithXorK(int[] arr, int k) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            int curr = 0;
            for (int j=i; j<arr.length; j++) {
                curr = curr ^ arr[j];
                if (curr == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public int solve(int[] A, int B) {
        HashMap<Integer,Integer> visited = new HashMap<Integer,Integer>();
        int c = 0;
        int cpx = 0;
        int n = A.length;
        for(int i = 0;i<n;i++) {
            cpx = cpx ^ A[i];
            if(visited.get(cpx^B) != null)
                c += visited.get(cpx ^ B);
            if(cpx == B) {
                c++;
            }
            if(visited.get(cpx) != null)
                visited.put(cpx, visited.get(cpx) + 1);
            else
                visited.put(cpx, 1);
        }
        return c;
    }

}
