package BasicPatterns;

public class Ten {
    public static void main(String[] args) {
        int n = 4;
        int space = 2 * (n-1);
        for (int i=1; i<=n; i++){

            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int k=1; k<=space; k++){
                System.out.print(" ");
            }
            for (int k=i; k>=1; k--){
                System.out.print(k);
            }
            System.out.println();
            space -= 2;
        }
    }
}
