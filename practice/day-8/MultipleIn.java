//This won't run in java
class SuperParent {
    
    String food = "food";
    // public static void main(String[] args) {}

}

class Parent{
    
    String fruit = "fruit";
    // public static void main(String[] args) {}

}

public class MultipleIn extends Parent ,SuperParent{ 
    
    public static void main(String[] args) {

        MultipleIn obj = new MultipleIn();

        System.out.println(obj.food);
        System.out.println(obj.fruit);

    }

}