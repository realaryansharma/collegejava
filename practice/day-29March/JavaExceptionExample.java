public class JavaExceptionExample {

    public static void main(String args[]) {

        int[] arr = {1, 2, 3};

        try {
            
            int data = 100/5;

            try {
                int ans = arr[6];
                System.out.println(ans);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Of Bound Error");
            }

        }
        catch(ArithmeticException e) {
            System.out.println(e);
            System.out.println("I am in Catch Block");
        }
        finally {
            System.out.println("Resetting the code!");
        }

    }

}