package previous.BasicPatterns;

public class SixTeen {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int check = n - 1;

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + check));
                check--;
            }
            System.out.println();
        }
    }
}
