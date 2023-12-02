package question5;

import java.sql.SQLOutput;

public class Employee {

    String name;
    int empId;
    int salary;

    Employee() {
        System.out.println("Hey, I'm Default Constructor");
    }

    Employee(String name, int empID, int salary) {
        this.name = name;
        this.empId = empID;
        this.salary = salary;
    }

    void increaseSalary(int increment) {
        this.salary += increment;
    }

    void display() {
        System.out.println("Salary of " + name + " is " + salary);
    }

}
