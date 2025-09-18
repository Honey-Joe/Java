//biggest and smallest number
import java.util.Scanner;
public class Q2{
    public static int add(int a,int b, int c){
        int sum = a+b+c;
        return sum; 
    }
    public static int product(int a, int b,int c){
        int product = a*b*c;
        return product;
    }
    public static int smallest(int a,int b, int c){
        if(a<b){
            if(a<c){
                return a;
            }
            else{
                return c;
            }
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }
    public static int biggest(int a,int b, int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b  = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        System.out.println("Sum: " + add(a,b,c));
        System.out.println("Product: "+ product(a,b,c));
        System.out.println("Biggest number: "+ biggest(a,b,c));
        System.out.println("Smallest number: "+ smallest(a,b,c));
    }
}