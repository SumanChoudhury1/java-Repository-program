import java.util.*;
public class holorect
{
	public static void main(String[] args)
	{
		int n=8;
		int m=9;
		//outer loop
		for(int i=1; i<=n; i++)
		{
			//inner loop
			for(int j=1; j<=m; j++)
			{
				 //cell->(i,j)
				if(i==1||j==1||i==n||j==m)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}