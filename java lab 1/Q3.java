//biigest and smallest element in an array
import java.util.Scanner;
public class Q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int large = 0;
        int small = Integer.MAX_VALUE;
        int[] a = new int[n];
        for (int i=0; i<n;i++){
            System.out.println("Enter a number");
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if(a[i]>large){
                large = a[i];
            }
        }
        for(int i=0; i<n;i++){
            if(a[i]<small){
                small = a[i];
            }
        }
        System.out.println("Largest number is:"+ large);
        System.out.println("Smallest number is :" + small);

    }
}