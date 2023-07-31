package previous.arrayproblems.relevel;
import java.util.*;

public class GeekAndXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }
        while (q-- > 0) {
            int k = sc.nextInt();
            int l1 = sc.nextInt() - 1;
            int r1 = sc.nextInt() - 1;
            int l2 = sc.nextInt() - 1;
            int r2 = sc.nextInt() - 1;
            int ans = 0;
            for (int i = l1; i <= r1; i++) {
                for (int j = l2; j <= r2; j++) {
                    int x = a1[i] ^ a2[j];
                    int cnt = 0;
                    while (x > 0) {
                        if ((x & 1) == 1) {
                            cnt++;
                        }
                        x >>= 1;
                    }
                    if (cnt == k) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}