package current.pattern;

import java.util.Scanner;

public class ElevenToTwenty {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//       eleven(n);
//       twelve(n);
//         thirteen(n);
//        fourteen(n);
//         fifteen(n);
//        sixteen(n);
//        seventeen(n);
//        eighteen(n);
//        nineTeen(n);
        twenty(n);
    }

    private static void twenty(int n) {
        int starCount = 1;
        int spaceCount = 2 * n - 2;
        for (int i=0; i<2*n; i++){
            for (int j=0; j<starCount; j++) {
                System.out.print("*");
            }
            for (int j=0; j<spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<starCount; j++) {
                System.out.print("*");
            }
            if (i < n-1) {
                starCount++;
                spaceCount -= 2;
            }else {
                starCount--;
                spaceCount += 2;
            }
            System.out.println();
        }
    }

    private static void nineTeen(int n) {
        int firstst = n;
        int secondst = n;
        int space = 0;
        for (int i=0; i<2*n-1; i++) {
           for (int j=0; j<firstst; j++){
               System.out.print("*");
           }
           for (int j=0; j<space; j++) {
               System.out.print(" ");
           }
           for (int j=0; j<secondst; j++) {
               System.out.print("*");
           }
           if (i < n-1) {
               space += 2;
               firstst -= 1;
               secondst -=1;
           }else {
               space -= 2;
               firstst += 1;
               secondst +=1;
           }
            System.out.println();
        }

    }

    private static void eighteen(int n) {
        for (int i=n; i>0; i--) {
            for (int j=i; j<=n; j++) {
                char ch = (char) (65 + j-1);
                System.out.print(ch + " ");
//                count--;

            }
            System.out.println();
        }
    }

    private static void seventeen(int n) {
        int space = n;
        int star = 1;
        for (int i=0; i<n; i++){
            int count = 64;

            for (int j=0; j<space; j++) {
                System.out.print(" " + " ");
            }
            for (int j=0; j<star; j++) {
                char ch = (char) (count + 1);
                System.out.print(ch+ " ");
                if ( space+ j < n) {
                    count++;
                }else {
                    count--;
                }
            }
            space -= 1;
            star += 2;
            System.out.println();
        }
    }

    private static void sixteen(int n) {
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                char alpha = (char) ((char)65 + count);
                System.out.print(alpha + " ");
            }
            count++;
            System.out.println();
        }
    }

    private static void fifteen(int n) {
        int count = 0;
        for (int i=n; i>0; i--) {
            count = 0;
            for (int j=0; j<i; j++) {
                char alpha = (char) ((char)65 + count);
                System.out.print(alpha + " ");
                count++;
            }
            System.out.println();
        }
    }

    private static void fourteen(int n) {
        int count = 0;
        for (int i=0; i<n; i++) {
            count = 0;
            for (int j=0; j<=i; j++) {
                char alpha = (char) ((char)65 + count);
                System.out.print(alpha + " ");
                count++;
            }
            System.out.println();
        }
    }

    private static void thirteen(int n) {
        int count  = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    private static void twelve(int n) {
        int space = 2*n-2;
        int count = 1;
        for (int i=0; i<n; i++) {
            count = 0;
            for (int j=0; j<=i; j++) {
                count++;
                System.out.print(count +  " ");
            }
            for (int j=0; j<space; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print(count);
                count--;
            }
            space -= 2;
            System.out.println();
        }
    }

    private static void eleven(int n) {
        int single = 1;
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++) {
                System.out.print(single + " ");
                if (single == 1) {
                    single = 0;
                }else {
                    single = 1;
                }
            }
            System.out.println();
        }
    }
}
