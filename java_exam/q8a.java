import java.util.Scanner;
import java.io.*;
class q8a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        int result = a*b*c;
        System.out.printf("result = %d",result);
    }
}