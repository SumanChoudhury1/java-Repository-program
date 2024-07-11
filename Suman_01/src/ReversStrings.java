import java.util.Scanner;

public class ReversStrings {

	public static void main(String[] args) {
		String name;
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your valu :");
		name=sc.nextLine();
		int len=name.length();
		for(int i = len -1;i>=0;i--) {
			//rev=rev+;
		System.out.print(name.charAt(i));
		}
	}

}
