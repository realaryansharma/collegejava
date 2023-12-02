import java.util.*;

public class Grades {

    public static void main(String[] args) {

        int size, counter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        size = input.nextInt();

        int[] marks = new int[size];

        System.out.print("Enter the marks : ");

        for(counter = 0; counter<size; counter++) {
            marks[counter] = input.nextInt();
        }

        Arrays.sort(marks);

        System.out.println("\n--------------Grades--------------\n");

        for(counter=0; counter<size; counter++) {
            if(marks[counter] < 40)
                System.out.println(marks[counter] + "\tFAIL");
            else if(marks[counter] >= 40 && marks[counter] <= 50)
                System.out.println(marks[counter] + "\tPASS");
            else if(marks[counter] >= 51 && marks[counter] <= 75)
                System.out.println(marks[counter] + "\tMERIT");
            else
                System.out.println(marks[counter] + "\tDISTINCTION");
        }

        // Between 40 and 50 : PASSBetween 51 and 75 : MERITand above : DISTINCTION



    }

}