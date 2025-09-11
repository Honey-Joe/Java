import java.util.Scanner;
public class StringManipulation{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String s = sc.nextLine();
    String vowles = " ";
    String cons = " ";
    for(int i=0 ; i<s.length(); i++){
        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u'){
            vowles += s.charAt(i);
        }else{
            cons += s.charAt(i);
        }
    }
    System.out.println("Vowels"+ vowles);
    System.out.println("Consonents " + cons);
    }
}