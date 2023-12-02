package question1;
class Parent {
    private int num=80;
    private void disp() {
        System.out.println("Hello I am " + num);
    }
}

public class AccessPri extends Parent{
    public static void main(String[] args) {

        Parent obj = new Parent();
//        System.out.println(obj.num);
//        obj.display();

    }
}