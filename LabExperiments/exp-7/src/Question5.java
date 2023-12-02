class IfZero extends Exception{

    IfZero() {
        super("Both a and b are zero\n");
    }

}

class IfNegative extends Exception{

    IfNegative() {
        super("One of them is Negative\n");
    }

}

class Calc {

    long power(int num1, int num2) {
        try {
            if(num1==0 && num2==0)
                throw new IfZero();
            if(num1<0 || num2<0)
                throw new IfNegative();
        }
        catch(IfZero e) {
            System.out.println(e);
        }
        catch(IfNegative e) {
            System.out.println(e);
        }
        System.out.println(Math.pow(num1, num2));
        return 0;
    }
}

public class Question5 {

    public static void main(String[] args) {

        Calc obj1 = new Calc();
        obj1.power(4, 8);

    }

}
