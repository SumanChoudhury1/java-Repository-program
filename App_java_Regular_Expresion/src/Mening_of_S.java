import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mening_of_S {

	public static void main(String[] args) {
		//mobile number validator in form
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Your Valid Mobile Number : ");
			Long MobileNo=s.nextLong();
			String str = MobileNo.toString();
			int count=0;
			
			Pattern p = Pattern.compile("[6-9][0-9]{9}");
			Matcher m= p.matcher(str);
			while(m.find()) {
				count++;	
			}
			if (count !=0 || str.length()<10) {
				System.out.println("Error");
			}else if(str.length()==10){
				System.out.println("Accepted");
				
			}	
		}catch(Exception e){
			System.out.println(e);
			System.out.println("invalid inpute");
		}
		}
	}
