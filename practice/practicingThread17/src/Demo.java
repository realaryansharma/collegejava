class A extends Thread{
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("hello!");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{ // implements runnable interface can also be used to create thread but it wont have thread methods
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Heya!");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Demo {

    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority()); //Lies bw 1 to 10, where 1 is the least priority
        System.out.println(obj2.getPriority());

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();

    }

}