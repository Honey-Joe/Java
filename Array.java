import java.util.Scanner;

public class Array{
    public static void main(String args[]){
        // int[] a = new int[5];
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements: "); 
        for(int i=0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The elements in the array");
        for(int i = 0; i< n ; i++){
            System.out.println(a[i]);
        }
        
    }
}