import java.util.Scanner;

public class MonthEqui {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.print("Enter any number : ");
        int monthNum = input.nextInt();

        System.out.print(months[monthNum-1]);

    }

}
