import java.util.Scanner;
public class exp8q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s="";
        String msg=in.nextLine();
        for(int i=0;i<msg.length();i++)
        {
            if(Character.isUpperCase(msg.charAt(i))||msg.charAt(i)==' ')
            s+=msg.charAt(i);
            else
            s+=(char)(msg.charAt(i)-32);
        }
        in.close();
        System.out.println(s);
    }
}
