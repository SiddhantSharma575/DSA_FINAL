package previous.BasicPatterns;

public class Six {
    public static void main(String[] args) {
        int n=5;
        int sp = n;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=sp-1; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            sp -= 1;
            System.out.println();
        }
    }
}
