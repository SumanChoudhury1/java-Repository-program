import java.util.*;
public class NumberP {

	public static void main(String[] args) {
		System.out.print("Enter the Valu :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-1;j++) {
				System.out.print("  ");
			}
			int x=i;
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
				x=x+n-j;
			}
			System.out.println();
		}

	}

}
