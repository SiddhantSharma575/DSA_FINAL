package previous.arrayproblems.relevel;

import java.util.Arrays;

public class AdityaTwo {
    public static void main(String[] args) {
        System.out.println(solveBhai());
    }

    private static long solveBhai() {
        long[] time = {1000};
        long num = 10000000;
        long n = time.length;
        if (n == 1) {
            long res = num * time[0];
            return res;
        }
        long left = 1;
        long right = Arrays.stream(time).sum() * num;
        while (left < right) {
            long mid = (left + right) / 2;
            int count = 0;
            for (long t : time) {
                count += mid / t;
            }
            if (count >= num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}