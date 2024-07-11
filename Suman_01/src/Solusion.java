import java.util.*;
public class Solusion {

	public static void main(String[] args) {
		System.out.print("Enter the valu :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(ar[i]>ar[i+1])
				System.out.print(ar[i]+" ");
			else
				System.out.print(ar[i+1]+" ");
			}
		  if(ar[0]>ar[n-1])
			  System.out.print(ar[0]+" ");
			else
				System.out.print(ar[n-1]+" ");
		}

	}


