import java.util.Scanner;
interface constant
{
    static float pi=3.14f;
    static float compute(float r)
    {
        return pi*r*r;
    }
}
class Exp5Q3 implements constant
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        float x=sc.nextFloat();
        sc.close();
        System.out.println("Area of circle is "+constant.compute(x));
    }
}
