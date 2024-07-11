import java.util.Scanner;
import java.math.BigInteger;
public class factorial {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=n;
		BigInteger fact=BigInteger.ONE;
		while(n>1){
			fact=fact.multiply(BigInteger.valueOf(n));
			n--;
			
		}
		System.out.print("the factorial of " + s + " is " +fact );
	}

}
