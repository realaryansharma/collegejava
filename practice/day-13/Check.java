//Animal is called automatically
class Animal {

    Animal() {
        System.out.println("Animal");
    }

    void great() {
        System.out.println("sdaf");
    }
}

class Dog extends Animal {
    
    Dog() {
        System.out.println("Dog");
        super.great();
    }

}

public class Check {

    public static void main(String[] args) {

        Dog d =  new Dog();

    }

}