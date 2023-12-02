class Animal {
    String color = "White";

    void printColor() {
        System.out.println("I am Animal");
    }

}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
        // super.printColor();
    }

}

class SuperKey {
    
    public static void main(String[] args) {

        Dog d  = new Dog();
        d.printColor();
        String a=d.Super();


    }

}