public class PracticeMethods {

    public static void main(String args[]) {

        String s1 = "      Hel  lo  ";
        String s2 = "Hello";
        String s3 = "GeoodBye";
        String s4 = "HELLO";

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.trim());
        System.out.println(s3.indexOf('B'));
        System.out.println(s3.lastIndexOf('o'));
        System.out.println(s3.lastIndexOf('e',s3.length()-3));
        System.out.println(s3.indexOf('e', 3)); //start searching after 3
        System.out.println(sb.capacity()); //start searching after 3

    }

}