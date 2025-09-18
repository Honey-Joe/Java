import java.util.Scanner;
public class Q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 digit number:");
        int a = sc.nextInt();
        int temp = 0;
        int[] s = new int[5];
        int i = 0;
        while(a>0){
            temp = a%10;
            s[i]= temp;
            a=a/10;
            i++;
        }

        // for(int j =0;j<5;j++){
        //     System.out.print(s[j]);
        // }

        for(int j = 4 ; j>=0 ; j-- ){
            System.out.print(s[j]+"   ");
        }
    }
}