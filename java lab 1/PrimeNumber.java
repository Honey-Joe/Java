import java.util.Scanner;

public class PrimeNumber {
    public static boolean prime(int a) {
        if (a == 1) {
            return false;
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }
    }

}