import java.util.*;
class StringFormatter {
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}

public class ReverseString {
    public static void main(String[] args) {

        String choice;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sentence : ");

        choice = input.nextLine();

        System.out.println("String Used : " + choice);
        System.out.println("Answer : " + StringFormatter.reverseString(choice));
    }
}  