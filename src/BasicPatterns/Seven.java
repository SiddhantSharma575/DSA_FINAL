package BasicPatterns;

public class Seven {
    public static void main(String[] args) {
        int n = 5;
        int sp=0;
        for (int i=n; i>=1; i--){
            for (int k=1; k<=sp; k++){
                System.out.print(" ");
            }
            for (int j=2*i-1; j>=1; j--){
                System.out.print("*");
            }

            sp += 1;
            System.out.println();
        }
    }
}
