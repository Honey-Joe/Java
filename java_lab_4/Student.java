public class Student{
    private String Name;
    private String email;
    private String course;
    Student(){
        this.Name="Unknown";
        this.email="Not provided";
        this.course="Not enrolled";
    }
    Student(String Name,String email,String course){
        this.Name=Name;
        this.email=email;
        this.course=course;
    }
    Student(Student s1){
        this.Name=s1.Name;
        this.email=s1.email;
        this.course=s1.course;
    }
    String getName(){
        return Name;
    }
    String getemail(){
        return email;
    }
    String getcourse(){
        return course;
    }
}
