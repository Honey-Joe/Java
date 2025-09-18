//get the no of books in the day that has been issued in the week. Find the total no of books issued in the week and most no of books issued in the day
import java.util.Scanner;

public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        String[] days = {"Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday"};

        for(int i = 0 ; i < 7 ; i++){
            System.out.print("The no of books issued in " + days[i] + " is: ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int max = 0;
        String day = " ";
        
        for(int i = 0 ; i < 7 ; i++){
            sum += arr[i];
        }
        for(int i = 0 ; i < 7 ; i++ ){
            if(arr[i]>max){
                max = arr[i];  
                day = days[i];     
            }
        }

        System.out.println("Total no of books issued in the week " + sum);
        System.out.println("The maximum no of books issued on " + day  + " with " +  max);
        
    }
}