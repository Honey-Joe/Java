import java.util.Scanner;

public class Arithmetic{
    public static void Add(int a , int b){
            int sum = a+b;
            System.out.println("Sum of two numbers : "+ sum);
        }

        public static void Sub(int a, int b){
            int sub = a-b;
            System.out.print("Subraction of two numbers : "+sub);
        }

        public static void Multiply(int a , int b){
            int mul = a*b;
            System.out.println("Multliplication of two numbers : " + mul);
        }

        public static void Divide(int a , int b){
            int divide = a/b;
            System.out.println("Division of two numbers " + divide);
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        
        Add(a,b);
        Sub(a,b);
        Multiply(a,b);
        Divide(a,b);
    }
}