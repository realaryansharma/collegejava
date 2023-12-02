import java.util.Scanner;
interface operation
{
    float division(int a,int b);
    float modulus(int a,int b);
}
class Exp5Q4 implements operation
{
    public float division(int a,int b)
    {
        return a/b;
    }
    public float modulus(int a,int b)
    {
        return a%b;
    }
    public static void main(String[] args) {
        Exp5Q4 ob=new Exp5Q4();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first value");
        int a=in.nextInt();
        System.out.println("Enter second value");
        int b=in.nextInt();
        System.out.println(a+" divide by "+b+" is "+ob.division(a, b));
        System.out.println(a+" modulus "+b+" is "+ob.modulus(a, b));
        in.close();
    }
}


