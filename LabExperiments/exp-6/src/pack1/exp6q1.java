//package pack1;
//public class sample
//{
//    public int add(int x,int y)
//    {
//        return x+y;
//    }
//    public static void main(String[] args)
//    {
//        System.out.println("inside pack1");
//    }
//}
//import pack1.sample;
//import pack1.sample.*;
//import java.math.*;
//
//public class exp6q1 {
//    public static void main(String[] args) {
//        int x=4,y=23;
//        sample ob=new sample();
//        System.out.println(Math.exp(x));
//        System.out.println(ob.add(x,y));
//    }
//}
//

package q;
import p.*;
public class b {
    public static void main(String[] args) {
        A a=new A();
        //a.meth1();private not accessible in non subclass of different package
        //a.meth2();protected not accessible in non subclass of different package
        //a.meth3();default not accessible in non subclass of different package
        a.meth4();
    }
}
