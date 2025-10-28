import java.util.*;
// Base class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary); // call parent constructor
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails(); // reuse parent method
        System.out.println("Department: " + department);
    }
}

// Subclass Developer
class Developer extends Employee {
    String project;

    Developer(String name, double salary, String project) {
        super(name, salary);
        this.project = project;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Project: " + project);
    }
}

// Main class
public class abstractprog {
    public static void main(String[] args) {
        Employee e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();

        e = new Manager(name, 80000, "Sales");
        System.out.println("--- Manager Details ---");
        e.displayDetails();

        System.out.println();

        e = new Developer("Ravi", 60000, "Website Revamp");
        System.out.println("--- Developer Details ---");
        e.displayDetails();
    }
}
