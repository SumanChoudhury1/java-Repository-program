import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class A_1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the valu : ");
		String str=s.next();
		
		int count=0;
		Pattern p = Pattern.compile("[7-9] [0-9] {10}");
		Matcher m =p.matcher(str);
		while(m.find()) {
			count++;
		}
		if(count !=0 || str.length()<3) {
			System.out.println("Error");
		}else {
			System.out.println("Input Accepted");
		}

	}

}
