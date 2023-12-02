public class First {

    //Defining a public method
    public void check1() {
        System.out.println("\nI am a public method");
    }

    //Defining a static method
    public static void check2() {
        System.out.println("\nI am a static method");
    }

    public static void main(String[] args) {

        //Calling a static function
        check2();

        //Calling a public function
        First obj = new First();
        obj.check1();
        

    }

}