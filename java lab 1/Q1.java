//Arithmetic Operator in java

import java.util.Scanner;
public class Q1{
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int sub(int a , int b){
        int sub = a-b;
        return sub;
    }
    public static int multiply(int a , int b){
        int mul = a*b;
        return mul;
    }
    public static int divide(int a, int b){
        int div = a/b;
        return div;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.println("Addition: " + add(a,b));
        System.out.println("Subraction: " + sub(a,b));
        System.out.println("Multiplication: "+multiply(a,b) );
        System.out.println("Division : "+ divide(a,b));
    }
}