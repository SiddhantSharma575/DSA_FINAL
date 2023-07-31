package previous.arrayproblems.relevel;

public class AdityaOne {
    public static void main(String[] args) {
        int[] A = {8,4,2,6};
        int n = A.length;
        int[] leftMin = new int[n];

        int[] rightMin = new int[n];

        leftMin[0] = Integer.MAX_VALUE;
        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], A[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], A[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(0 - rightMin[i] +  " ");
            }else if (i == n-1) {
                System.out.println(leftMin[i] + " ");
            }else {
                System.out.print(leftMin[i] - rightMin[i] + " ");
            }
        }
    }
}