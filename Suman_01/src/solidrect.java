import java.util.*;
public class solidrect
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the valu");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		//outer loop
		for(int i=1; i<=n; i++)
		{
			//inner loop
			for(int j=1; j<=m; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}