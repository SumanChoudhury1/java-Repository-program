import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Mobile_no_Validator {

	public static void main(String[] args) {
		
     Scanner s = new Scanner(System.in);
     System.out.println("Enter your Valid Number : ");
     String str = s.next();
     
     String regex = "[6-9] [0-9] {9}";
     
     if(str.matches(regex)) {
    	 System.out.println("Valid Number");
     }else {
    	 System.out.println("In-Valid Number");
     }
	}

}
