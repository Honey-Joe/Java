import java.util.Scanner;

public class student{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students;");
        int stud = sc.nextInt();
        System.out.println("Enter the no of subjects : ");
        int sub = sc.nextInt();
        int[][] arr = new int[stud][sub];

        for(int  i= 0 ; i < stud ; i++){
            for(int j = 0 ; j < sub ; j++){
                System.out.println("Enter the student "  + i + "subject mark" + j + " :");
                arr[i][j] = sc.nextInt(); 
            }
        }

        for(int i=0;i<stud ; i ++){
            for(int j=0;j<sub ; j++){
                System.out.println("The student " + i + " subject mark "+ arr[i][j] );
            }
        }

        int[] total = new int[stud];
        // int max = new int[stud]; 
        for(int i = 0 ;i < stud ; i++){
            // total = 0;
            for(int j = 0 ; j < sub ; j++){
                total[i] += arr[i][j];
                
            }
            // System.out.println("The total marks of student " + i + " is " + total);
        }
        int max = 0;
        int student = 0;
        for(int i=0; i < stud ; i++){
            if(total[i]>max){
                max = total[i];
                student = i;
            }
        }
        System.out.println("The maximum mark obtained by "+ student + " with " + max);
    }
}