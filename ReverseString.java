import java.util.Scanner;

public class ReverseString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String rev = "";

        for(int i = s.length()-1 ; i>=0 ; i--){
            rev += s.charAt(i);
        }
        System.out.println("The Reverse of the String " + s + " is "+ rev);
        if(s.equals(rev)){
            System.out.println("The String is palindrome");
        }else{
            System.out.println("The String is not a palindrome");
        }
    }
}