import java.util.Scanner;

public class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean flag = true;
        if(n<2){
            flag=false;
        }
        for(int i=2 ; i <= n/2 ; i++){
            if(n%i==0){
                flag = false;
            }
        }
        if(flag){
            System.out.println( n + "is Prime");
        }else{
            System.out.println(n + " is not prime ");
        }
    }
}