class Employee {
    float salary = 4000;
    public static void main(String[] args) {}
}

public class First extends Employee {

    int aalu = 20;

    public static void main(String[] args) {

        First p = new First();
        System.out.println(p.salary);
        System.out.println(p.aalu);

    }

}