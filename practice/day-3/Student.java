import java.util.*;

public class Student {

    String name = "Aryan";
    String course = "MCA";
    int rollNo = 05;
    int sap = 500105117;

    public static void main(String[] args) {
        
        Student std = new Student();
        
        System.out.println("Student Name    : " + std.name);
        System.out.println("Student Course  : " + std.course);
        System.out.println("Student Roll No : " + std.rollNo);
        System.out.println("Student SAP     : " + std.sap);
    }

}