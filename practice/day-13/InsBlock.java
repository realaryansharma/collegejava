class trial {

    void trhy() {
        System.out.println("I am super keyword!");
    }
    trial() {
        System.out.println("I am super keyword!");
    }

}

class Bike extends trial{

    Bike() {
        System.out.println("I am in Constructor");
        super();    

    }

    {
        System.out.println("I am the block that youo have Created!");
    }

    

}


public class InsBlock{

    public static void main(String[] args) {

        Bike obj = new Bike();
        
    }

}