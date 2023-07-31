package previous.BasicMath;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int temp = n;
        while (temp != 0){
            count++;
            temp = temp/10;
        }
        temp = n;
        while (temp != 0){
            int rem = temp % 10;
            sum += Math.pow(rem,count);
            temp = temp/10;
        }
        System.out.println(sum);
    }
}
