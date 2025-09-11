import java.util.Scanner;

public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int rev = 0;
        while(n>0){
            rev = (rev*10)+(n%10);
            n=n/10;
        }
        System.out.println(rev);
    }
}