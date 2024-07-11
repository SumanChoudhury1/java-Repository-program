import java.util.*;
public class armsNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the valu: ");
		int no=sc.nextInt();
		int temp=no;
		int rev=0,rem;
		while(temp !=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(no==rev) {
			System.out.print("No is palimdram");
		}else {
			System.out.print("no is not palimdram");
		}
		

	}

}
