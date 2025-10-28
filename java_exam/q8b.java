import java.util.*;
class q8b{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        if(n<0){
            n = Math.abs(n);
        }
        int temp = n;
        while(temp>0){
            int digit = temp%10;
            sum += digit;
            // System.out.println(digit);
            temp = temp/10;
        }   
        System.out.println(sum);
    }
}