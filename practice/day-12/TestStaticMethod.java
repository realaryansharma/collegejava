class Student {

    int rollNo;
    String name;
    static String college = "UPES";

    static void change() {
        college  =  "UPES Dehradun";
    }

    Student(int r, String n) {

        rollNo = r;
        name = n;

    }

    void display() {
        
        System.out.println(rollNo + " " + name + " " + college);

    }

}

public class TestStaticMethod {

    public static void main(String[] args) {

        Student.change();

        Student s1 = new Student(1, "Aryan");
        Student s2 = new Student(2, "Kanav");

        s1.display();
        s2.display();

    }

}