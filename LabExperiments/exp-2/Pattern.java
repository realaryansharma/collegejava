import java.util.*;

class Pattern {
    
    public static void  main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows;

        System.out.print("Number of rows : ");
        rows = input.nextInt();

        for(int i=0; i<rows*2; i+=2) {

            for(int j=0; j<=i; j++) {

                System.out.print("*");

            }

            System.out.print("\n");
        }

    }

}