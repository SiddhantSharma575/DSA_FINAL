package previous.BasicPatterns;

public class Eight {
    public static void main(String[] args) {
        int n = 5;
        int sp = n-1;
        int st = 1;
        for (int i=1;  i<=2*n; i++){
            for (int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            if (i < n){
                sp--;
            }else {
                sp++;
            }
            for (int j=1; j<=st; j++){
                System.out.print("*");
            }
            if (i < n){
                st += 2;
            }else {
                st-= 2;
            }
            System.out.println();
        }
    }
}
