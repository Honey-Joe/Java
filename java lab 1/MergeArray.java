import java.util.Scanner;
public class MergeArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4};
        int[] b = {5,6,1,3,4};
        int k = 0;
        int f =0;
        int temp = a.length + b.length;
        int[] c = new int[temp];
        for(int i=0; i<temp ; i++){
            if(k<a.length){
                c[k] = a[i];
                k++;
                f=k;
            }else{
                c[k]= b[i-f];
                k++;
            }
        }
        for(int i=0; i<temp; i++){
            System.out.println(c[i]);
        }
    }
}