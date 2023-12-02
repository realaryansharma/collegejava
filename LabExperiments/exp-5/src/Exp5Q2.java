interface a
{
    void meth1();
    void meth2();
}
class MyClass implements a
{
    public void meth1()
    {
        System.out.println("Method 1 implemented");
    }
    public void meth2()
    {
        System.out.println("Method 2 implemented");
    }
}
class Exp5Q2
{
    public static void main(String[] args) {
        MyClass ob=new MyClass();
        ob.meth1();
        ob.meth2();
    }
}
