class SuperParent {
    
    String food = "food";
    // public static void main(String[] args) {}

}

class Parent extends SuperParent{
    
    String fruit = "fruit";
    // public static void main(String[] args) {}

}

public class MultiLevelIn extends Parent{ 
    
    public static void main(String[] args) {

        MultipleIn obj = new MultipleIn();

        System.out.println(obj.food);
        System.out.println(obj.fruit);

    }

}