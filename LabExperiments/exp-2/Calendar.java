import java.util.*;

public class Calendar {

 public static void main(String[] args) {

   int counter;
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter date in the format DD MM YYYY: ");

   int day = sc.nextInt();
   int month = sc.nextInt();
   int year = sc.nextInt();

   int[] allMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   int countDays = 0;


   for (counter = 1970; counter < year; counter++)
     countDays += isLeapYear(counter) ? 366 : 365;

   for (counter = 0; counter < month - 1; counter++)
     countDays += allMonths[counter];

   countDays += day;

   if (month > 2 && checkLeapYear(year))
     countDays++;

   System.out.println("Number of days since 1 January 1970: " + countDays);

 }

 public static boolean checkLeapYear(int year) {
   return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
 }

  public static boolean isLeapYear(int year) {
   return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }

}
