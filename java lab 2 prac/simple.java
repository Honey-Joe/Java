import java.util.Scanner;

public class simple{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(i = 0 ; i<n ; i++){
            System.out.println("Enter the elements : ");
            a[i] = sc.nextInt();
        } 
        System.out.println("The elements in the array :");
        for(i=0 ; i<n ; i++){
            System.out.println(a[i]);
        }
        
        
    }
} 