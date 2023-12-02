import java.util.Scanner;

public class Squares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ans = new int[10];
        int i=0;

        System.out.print("Enter the ten numbers : ");

        for(i=0; i<10; i++)
            ans[i] = input.nextInt();

        for(i=0; i<10; i++)
            System.out.print(ans[i] * ans[i] + " ");

    }

}
