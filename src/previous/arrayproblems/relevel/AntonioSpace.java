package previous.arrayproblems.relevel;
import java.util.Scanner;
public class AntonioSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int maxCapacity = 0;

        for (int i = 0; i < N; i++) {
            maxCapacity += A[i];  //sum of all the initial balls in the containers
        }

        maxCapacity += M; //additional balls to be stored

        int K = maxCapacity / N + (maxCapacity % N == 0 ? 0 : 1); //minimum capacity required to store all the balls

        System.out.println(K); //printing the minimum capacity required

    }
}
