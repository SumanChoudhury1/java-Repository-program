import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Leap_year
{
    public static void main(String[] args)
    {
        int year;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the valu:");
      year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
        {
        	System.out.println(year +" is a leap year");
        }
      else
         System.out.println(year +" is not a leap year");
   }
}