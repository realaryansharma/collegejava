public class Multi extends Thread{

    public void run() {
        System.out.println("Executing Thread");
    }

    public static void main(String[] args) {

        Multi t1 = new Multi();
        t1.start();

    }

}
