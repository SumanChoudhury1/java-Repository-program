import java.util.Scanner;
import java.math.BigInteger;
public class Solution {

	public static void main(String[] args) {
		System.out.print("Enter Your Valu : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		n=n*2-1;
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("*");
			}
			if (i<=n/2) {
				sp--;
				st=st+2;
			}
			else {
				sp++;
				st=st-2;
			}
			System.out.println();
		}
		

	}

}
