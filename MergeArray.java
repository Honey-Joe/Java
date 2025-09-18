import java.util.Scanner;
public class MergeArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,12,13};
        int[] b = {5,6,7,8,10};
        int k = 0;
        int f =0;
        int bn = b.length;
        int an = a.length;
        int temp = a.length + b.length;
        int[] c = new int[temp];
        int i = 0 , j = 0;

        while(k<temp){
            if(i<a.length && (j>=b.length || a[i]<b[j])){
                c[k]=a[i];
                k++;
                i++;
            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        for(int l=0; l<temp; l++){
            System.out.println(c[l]);
        }
    }
}