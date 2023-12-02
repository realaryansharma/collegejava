public class OverLoadMain {

    public static void main(String[] args) {
        System.out.println("main main args");

        main("Aryan");
        main();
        main("a", "b");

    }

    public static void main(String args) {
        System.out.println("main with args");
    }

    public static void main() {
        System.out.println("main without args");
    }

}