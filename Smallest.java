import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0 ; i<a ; i++){
            System.out.println("Enter a number");
            arr[i] = sc.nextInt();
        }
        int large = 0;
        int small = Integer.MAX_VALUE;
        for(int i=0; i<a; i++){
            if(arr[i]>large){
                large = arr[i];
            }if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println(large);
        System.out.println(small);
    }
}
