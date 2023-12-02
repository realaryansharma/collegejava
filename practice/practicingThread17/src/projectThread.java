import java.sql.SQLOutput;
import java.util.Scanner;

class threadCreation extends Thread{

    public void run() {
        System.out.println("I am a Thread baby!");
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }

    }

}

public class projectThread {

    public static void main(String[] args) {

        int totalThreads, choice;

        Scanner input = new Scanner(System.in);

        System.out.print("\nHow many threads do you want a process to have : ");
        totalThreads = input.nextInt();

        System.out.println("\n1. FCFS\n2. LIFO\n3. Priority\n4. Random Allocation\n5. Time Slice\n");
        System.out.print("\nWhich approach do you want to use : ");
        choice = input.nextInt();

        for(int i=0; i<choice; i++) {
            Thread thread = new Thread(new threadCreation());
            thread.start();
        }

    }

}
