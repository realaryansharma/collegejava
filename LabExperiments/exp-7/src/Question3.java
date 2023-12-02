import java.util.Scanner;

class Below500 extends Exception{

    Below500() {
        super("The value that you have entered is less than 500\n");
    }

}

class Question3
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("\nEnter any number : ");
        num = input.nextInt();

        try {
            if (num < 500)
                throw new Below500();
        }
        catch(Below500 e) {
            System.out.println(e);
        }
    }
}