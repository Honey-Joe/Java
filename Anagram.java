import java.util.*;
public class Anagram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        int an = 0;

        char[] chararr1 = s1.toCharArray();
        char[] chararr2 = s2.toCharArray();

        Arrays.sort(chararr1);
        Arrays.sort(chararr2);
        

        String sorted = new String(chararr1);
        String sorted2 = new String(chararr2);

       

        
        
        // for(int i=0;i< s1.length(); i++){
        //     for(int j=0;j<s2.length(); j++){
        //         if(s1.charAt(i) == s2.charAt(j)){
        //             an++;
        //         }
        //     }
        // }
        // System.out.println(an);
        for(int i=0;i<s1.length();i++){
            if(sorted.charAt(i)==sorted2.charAt(i)){
                an++;
            }
        }
       
        if((s1.length()==s2.length()) && (an==s1.length())){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}