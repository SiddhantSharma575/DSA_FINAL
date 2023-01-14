package BasicRecursion;

public class PrintName {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<=5; i++){
            System.out.print("Sid ");
        }
        System.out.println();
        // using Recursion
        printN(n);
    }

    private static void printN(int n) {
        if (n == 0){
            return;
        }
        System.out.print("SID ");
        printN(n-1);
    }
}
