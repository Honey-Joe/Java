import java.util.Scanner;

public class Factorial{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number:");
  int a = sc.nextInt();
  int fact = 1 ;
  for (int i = 1 ; i <= a ; i ++){
     fact *= i;
  }
  sc.close();
  System.out.println("Factorial of " + a + " is " + fact);
  }
}  
  
  
