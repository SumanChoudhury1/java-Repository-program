import java.util.*;
public class Exception_1 {

	public static void main(String[] args) {
		int balance =500;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value :");
		int ammount=s.nextInt();
		if(balance>ammount) {
			System.out.print("pleas collect the cash");
		}else {
			try {
				throw new InSufficientFunds();	
			}catch(InSufficientFunds e) {
				System.out.println(e);
				System.out.println("Low Balanc!!");
			}
		}

	}

}
