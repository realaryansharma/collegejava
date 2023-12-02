import java.util.*;

public class LargestOfThree {

    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any three numbers : ");

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        System.out.println((num1>num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3));

    }

}