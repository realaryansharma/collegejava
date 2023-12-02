//Constructor Overlaoding
class Pcon {

    int b = 90;

    Pcon() {
        System.out.println("Will I still work?");
    }

    Pcon(String name, int num1, int num2) {
        System.out.println("Hey! I am " + name);
        int sum = num1 + num2 + b;
        System.out.println("Sum of given two numbers are :  " + sum);
    }
    
    Pcon(int num1) {
        System.out.println("Ths is the magic of method overloading " + num1);
        num1 = num1 + b;
        System.out.println(num1);
    }

   

    public static void main(String[] args) {

        Pcon d1 = new Pcon("Aryan", 5, 10);
        Pcon d2 = new Pcon(10);
        Pcon d3 = new Pcon();

    }
}