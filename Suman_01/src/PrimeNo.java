import java.util.*;
public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Valu");
		int no=sc.nextInt();
		int temp=0;
		for(int i=2;i<=no-1;i++) {
			if(no%i==0) {
				temp=temp+1;
			}
		}
		
		if(temp==0) {
			System.out.print(no+"no in prime number");
		}else {
			System.out.print(no+"is not prime no");
		}

	}

}
