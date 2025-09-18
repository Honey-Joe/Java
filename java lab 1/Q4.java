import java.util.Scanner;
public class Q4{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n = 8;
        for(int i=0;i<n ; i++){
            if(i%2==0){
                for(int j=0; j<6;j++){
                System.out.print("* ");
                }
            }
            else{
                for(int j=0;j<6;j++){
                System.out.print(" *");
            }
            
            }
            System.out.println();
        }
    }
}