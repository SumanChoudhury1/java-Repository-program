import java.util.*;
public class While {

	public static void main(String[] args) {
		/*
		int i=0;
		while(i<3) {
			System.out.println(i++);
			i++;*/
		Scanner s=new Scanner(System.in);
		String condition ="yes";
		while(condition.equals("yes")) {
			System.out.println("Enter the Amount : ");
			String amount =s.next();
			System.out.println("plese collect your amount. "+amount);
			System.out.println("do you want to continue(yes/no)?");
			condition=s.next();
			if (condition.equals("no")) {
				System.out.println("thank you!!");
			}
		}

	}

}
