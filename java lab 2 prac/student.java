import java.util.Scanner;

public class student{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students;");
        int stud = sc.nextInt();
        System.out.println("Enter the no of subjects : ");
        int sub = sc.nextInt();
        String[] names = new String[stud];
        int[][] arr = new int[stud][sub];
        
        for(int i = 0; i < stud; i++){
            System.out.println("Enter name of student " + (i+1) + ":");
            names[i] = sc.next();
        }

        for(int i = 0; i < stud; i++){
            for(int j = 0; j < sub; j++){
                System.out.println("Enter " + names[i] + " subject " + (j+1) + " mark:");
                arr[i][j] = sc.nextInt(); 
            }
        }

        int[] total = new int[stud];
        for(int i = 0; i < stud; i++){
            for(int j = 0; j < sub; j++){
                total[i] += arr[i][j];
            }
            System.out.println(names[i] + " total marks: " + total[i]);
        }
        
        int max = 0;
        int student = 0;
        for(int i = 0; i < stud; i++){
            if(total[i] > max){
                max = total[i];
                student = i;
            }
        }
        System.out.println("Highest marks obtained by " + names[student] + " with " + max);
    }
}