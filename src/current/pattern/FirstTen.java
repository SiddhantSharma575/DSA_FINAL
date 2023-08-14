package current.pattern;

import java.util.Scanner;

public class FirstTen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        first(n);
//        second(n);
//          third(n);
//         fourth(n);
//        five(n);
//        six(n);
//         seven(n);
//        eight(n);
//          nine(n);
        ten(n);
    }

    private static void ten(int n) {
        int star = 1;
        for (int i=0; i<=2*n; i++){

            for (int j=0; j<star; j++) {
                System.out.print("*"+ " ");
            }
            if(i < n-1) {
                star += 2;
            }else {
                star -= 2;
            }
            System.out.println();
        }
    }

    private static void nine(int n) {
        int space = n;
        int star = 1;
        for (int i=0; i<=2*n; i++){
            for (int j=0; j<space; j++) {
                System.out.print(" " + " ");
            }
            for (int j=0; j<star; j++) {
                System.out.print("*"+ " ");
            }
            if(i < n) {
                space -= 1;
                star += 2;
            }else {
                star -= 2;
                space += 1;
            }
            System.out.println();
        }
    }

    private static void eight(int n) {
        int space = 0;
        int star = 2*n-1;
        for (int i=0; i<n; i++){
            for (int j=0; j<space; j++) {
                System.out.print(" " + " ");
            }
            for (int j=0; j<star; j++) {
                System.out.print("*"+ " ");
            }

            space += 1;
            star -= 2;
            System.out.println();
        }
    }

    private static void seven(int n) {
        int space = n;
        int star = 1;
        for (int i=0; i<n; i++){
            for (int j=0; j<space; j++) {
                System.out.print(" " + " ");
            }
            for (int j=0; j<star; j++) {
                System.out.print("*"+ " ");
            }
            space -= 1;
            star += 2;
            System.out.println();
        }
    }

    private static void six(int n) {
        for (int i=n; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    private static void five(int n) {
        for (int i=n; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    private static void fourth(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }

    private static void third(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    private static void second(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    private static void first(int n) {
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
