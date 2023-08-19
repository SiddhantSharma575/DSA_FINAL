package current.basicrec;

public class PrintName {
    public static void main(String[] args) {
        printName(0,5);
    }

    private static void printName(int i, int j) {
        if (i == j)
            return;
        System.out.println("Siddhant");
        printName(i+1,j);
    }
}
