import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial_01
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter yoyr valu");
        int number=sc.nextInt();
        int i,fact=1;
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of "+number+" is "+fact);    
     }
}