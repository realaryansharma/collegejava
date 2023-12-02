import java.util.*;

public class Answers {

    Answers() {
        System.out.println("I am Default Constructor");
    }

    Answers(int num) {
        System.out.println("This is Parameterised Const with vallue " + num);
    }

    public static void Datatypes() {

        int choice;

        Scanner input = new Scanner(System.in);

        System.out.println("\n1. Integer\n2. Double\n3. Float\n4. Byte\n5. Long\n");
        System.out.println("Select a datatype : ");

        choice = input.nextInt();

        switch(choice) {

            case 1:
                System.out.println(Integer.SIZE);
                break;

            case 2:
                System.out.println(Double.SIZE);
                break;

            case 3:
                System.out.println(Float.SIZE);
                break;
            
            case 4:
                System.out.println(Byte.SIZE);
                break;
            
            case 5:
                System.out.println(Long.SIZE);
                break;

        }
    
    }

    public static void Operations() {

        int choice, num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of first variable : ");
        num1 = input.nextInt();
    
        System.out.print("Enter the value of second variable : ");
        num2 = input.nextInt();

        System.out.println("\n1. Addition(+)\n2. Subtraction(-)\n3. Multiply(*)\n4. Divide(/)\n5. Modulous(%)\n");
        System.out.print("Select a datatype : ");

        choice = input.nextInt();

        System.out.print("Answer is : ");

        switch(choice) {

            case 1:
                System.out.println(num1 + num2);
                break;

            case 2:
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println(num1 * num2);
                break;
            
            case 4:
                System.out.println(num1 / num2);
                break;
            
            case 5:
                System.out.println(num1 % num2);
                break;

        }

    }



    public static void main(String[] args) {

        int choice;

        Scanner input = new Scanner(System.in);

        System.out.println("\n1. Size of Datatypes\n2. Operations\n");

        System.out.print("Which question do you want to execute : ");
        choice = input.nextInt();

        switch(choice) {

            case 1:
                Datatypes();
                break;

            case 2:
                Operations();
                break;

            default:
                System.out.println("Wrong value selected");

        }


        System.out.println("\n\nOverloading Of Constructor \n\n");

        Answers obj1 = new Answers();
        Answers obj2 = new Answers(6);
        Answers obj3 = new Answers(4);

        System.out.println("\n\nCopy Constructor \n\n");

        obj3 = obj2;

        System.out.println(obj3);

    }

}

