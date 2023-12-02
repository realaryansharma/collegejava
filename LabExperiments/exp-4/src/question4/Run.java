package question4;

public class Run{

    public static void main(String[] args) {

        Ordinary obj1 = new Ordinary();
        obj1.charges(50, "Ordinary");

        Urgent obj2 = new Urgent();
        obj2.charges(50, "Urgent");

        Lightning obj3 = new Lightning();
        obj3.charges(50, "Lightning");

    }

}
