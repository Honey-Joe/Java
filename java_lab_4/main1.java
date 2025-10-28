import java.util.Scanner;
public class main1{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter your name: ");
            String name = sc.nextLine();
            System.out.print("enter car type :");
            String type = sc.nextLine();
            System.out.print("Enter rental days: ");
            int days = sc.nextInt();
            carRental c = new carRental();
            System.out.println("Customer name"+c.getcname());
            carRental c2=new carRental(name,type,days);
            System.out.println("Customer name: "+ c2.getcname());
            System.out.println("car name: "+ c2.getctype());
            System.out.println("rental days: "+ c2.getrdays());

    }
}