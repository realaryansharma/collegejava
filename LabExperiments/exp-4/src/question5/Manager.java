package question5;

public class Manager {

    public static void main(String[] args) {

        Employee department = new Employee("Aryan", 1, 50000);
        department.display();
        department.increaseSalary(10000);
        department.display();

    }

}
