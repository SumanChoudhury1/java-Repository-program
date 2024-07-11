import java.util.*;
public class ATMPinEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter the Pin:-");
			int pin=sc.nextInt();
			if(pin==1234)
			{
				System.out.println("Hello Suman");

				for(int j=1;j<=5;j++) {
					if(j==1)
					{
						System.out.println("Deposit");
						break;}
					else if(j==2) {
						System.out.println("Withdraw");
						break;}
					else if(j==3) {
						System.out.println("Check_Balance");
						break;}
					else if(j==4) {
						System.out.println("Pin Change");
						break;}
					else if(j==5) {
						System.out.println("Exit");
						break;}
					}break;
				}
				
			
			else {
				if ((3 - i) == 0) {
					System.out.println("Card is Blocked Bye--Bye");
					break;
				}
				System.out.println("Pin is Wrong!!!...Suman Enter the pin Again");

				System.out.println("You have only " + (3 - i) + " Chance");
			}
		}
	}

}
