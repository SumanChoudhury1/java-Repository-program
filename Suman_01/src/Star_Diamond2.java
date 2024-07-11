import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Star_Diamond2{
    public static void main(String[] args)
    {
        //System.out.print("Enter the Value :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            int x=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                x=x+n-j;
            }
            System.out.println();
        }
    }
}