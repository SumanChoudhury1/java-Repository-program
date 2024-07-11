import java.util.*;
public class PalindromNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Valu");
		int no=sc.nextInt();
		int temp=no;
		int rev=0,arm;
		while(temp!=0){
			arm=temp%10;
			rev=rev*10+arm;
			temp=temp/10;	
		}
		if(no==rev) {
			System.out.print("is palindrim no");
		}else {
			System.out.print("Not a palindrom no");
		}
		
	}

}
