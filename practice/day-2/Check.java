public class Check {
    public static void main(String[] args) {

        int choice, sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("1. While Loop\n2. For Loop\n3. Do While Loop");
        System.out.print("Enter your choice : ");        
        
        choice  = input.nextInt();

        switch(choice) {

            case 1:
                
                for(int i=1; i<=10; i++) {
                    sum += i
                }

                break;

            case 2:

                int i=1;
                while(i<=10) {
                    sum += i;
                    i++;
                }

                break;
                
            case 3:

                break;

        }

        if(num) {
            System.out.println("heya");
        }
        else {
            System.out.println("heya");
        }

        // if(1) {
        //     System.out.println("heya");
        // }
        // else {
        //     System.out.println("heya");
        // }

    }
}