package BasicPatterns;

public class Twelth {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<=n; i++){
            int count = 0;
            for (int j=1; j<=i; j++){
                char cc = (char) (count + 65);
                System.out.print(cc);
                count++;
            }
            System.out.println();
        }
    }
}
