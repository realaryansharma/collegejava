class NonNum extends Exception{

    NonNum() {
        super("The value is not numeric\n");
    }

}

class Question2
{
    public static void main(String args[])
    {
        int a, b, c = 0;

        try {
            a = Integer.parseInt(args[1]);
            throw new NonNum();
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }
        catch(NonNum e) {
            System.out.println(e);
        }
    }
}