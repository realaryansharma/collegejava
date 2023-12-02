import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Output Using Cmd");

        switch(args[1]) {

            case "+":
                System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
                break;
            
            case "-":
                System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
                break;
            
            case "*":
                System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
                break;
            
            case "/":
                System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
                break;
            
            default:
                System.out.println("Invalid Operation");

        }

    }

}