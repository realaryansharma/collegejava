public class Question1 {
    public static void main(String[] args)
    {
        int rollNum[] = new int[10];
        String[] name = new String[10];

        try {
            name[22] = "Aryan";
        }
        catch (Exception e) {
            System.out.println("\nException Caught");
        }

        System.out.println("\nI'll always work\n");

    }
}
