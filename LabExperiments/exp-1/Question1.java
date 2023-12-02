public class Question1{

    public static void main(String[] args) {

        Dog obj = new Dog();
        
    }

}
class Animal {

    void notHuman() {
        System.out.println("Hey I can't be accesed.");
    }

}

class Dog extends Animal {

   Dog() {
        System.out.println("Hey I cant be accesed.");
        super.notHuman();
    }

}