package current.array.medium;

import java.util.ArrayList;
import java.util.Scanner;

public class ReArrangeArrayElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
//        int[] res = method1(arr, n);
        int[] res = optimal(arr, n);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }

    private static int[] method1(int[] arr, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }

        for (int i = 0; i < n / 2; i++) {
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        return arr;
    }

    public static  int[] optimal(int[] arr,int n) {
        int[] res = new int[n];
        int posi = 0;
        int negi = 1;
        for (int ele:  arr) {
            if (ele > 0 && posi < arr.length) {
                res[posi] = ele;
                posi += 2;
            }else {
                res[negi] = ele;
                negi += 2;
            }
        }
        return res;
    }
}
