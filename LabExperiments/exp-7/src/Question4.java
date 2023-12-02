import java.util.Scanner;

class NonPositive extends Exception{

    NonPositive() {
        super("a/b is either 0 or negative\n");
    }

}

public class Question4 {

    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the value of num1 : ");
        num1 = input.nextInt();

        System.out.println("\nEnter the value of num2 : ");
        num2 = input.nextInt();

        try {
            num3 = num1 / num2;
            System.out.println(num3);
            if(num3 <= 0)
                throw new NonPositive();
        }
        catch(NonPositive e) {
            System.out.println(e);
        }
    }
}
