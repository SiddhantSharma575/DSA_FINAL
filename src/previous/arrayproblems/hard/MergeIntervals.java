package previous.arrayproblems.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] intervals = new int[n][m];
        for (int i=0; i<intervals.length; i++){
            for (int j=0;  j<intervals[0].length; j++){
                intervals[i][j] = scn.nextInt();
            }
        }
        int[][] res =  merge((intervals));
        for(int i=0; i<res.length; i++) {
            for (int j=0; j<res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            if(currStart<=end && currEnd>=end){
                end = currEnd;
            }else if(currStart>end){
                list.add(new int[]{start,end});
                start = currStart;
                end = currEnd;
            }
        }
        list.add(new int[]{start,end});
        int[][] res = new int[list.size()][2];
        for(int i=0;i<res.length;i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
