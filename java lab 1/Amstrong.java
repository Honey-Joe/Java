import java.util.Scanner;
import java.lang.*;
public class Amstrong {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = a.nextInt();
        int digit = 0;
        int x = n;
        while(x>0){
            digit++;
            x = x/10;
        }
        System.out.println(digit);
        int ams = 0;
        int y = n;
        while (y>0) {
            int temp = y%10;
            ams += Math.pow(temp, digit);
            y = y/10;
        }
        System.out.println(ams);
        if (ams == n) {
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }
    }    
}
