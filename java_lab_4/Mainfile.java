public class Mainfile {
    public static void main(String args[]){
        Student S=new Student();
        System.out.println("Name"+S.getName());
        System.out.println("Name"+S.getemail());
        System.out.println("Name"+S.getcourse());
        Student S2=new Student("Joe","sara@gmail.com","IT");
        System.out.println("Name"+S2.getName());
        System.out.println("Name"+S2.getemail());
        System.out.println("Name"+S2.getcourse());
        Student S3=new Student(S2);
        System.out.println("Name"+S3.getName());
    }
}
