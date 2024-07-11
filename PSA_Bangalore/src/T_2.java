import java.util.*;
public class T_2 {
	public static void main(String args[])
    {
 
        // Input strings
        String mydelim = " : ";
        String mystr
            = "JAVA : Co de : StringTokenizer : Geeks";
 
        // Use of Constructor 2
        // Here we are passing Delimiter - "mydelim"
        StringTokenizer geeks
            = new StringTokenizer(mystr, mydelim);
 
        // Counting no. of tokens present
        // using countTokens() method
        int count = geeks.countTokens();
 
        // Printing no. of tokens present
        System.out.println("Number of tokens : " + count);
 
        //  Condition holds true till there is
        // single token remaining using hasMoreElements()
        // method True if tokens are present
        while (geeks.hasMoreElements())
 
            //  Returning the next token
            // using nextElement() method
            System.out.println(geeks.nextElement());
    }

}
