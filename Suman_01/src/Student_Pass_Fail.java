import java.util.*;
public class Student_Pass_Fail
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int P=sc.nextInt();
		int Q=sc.nextInt();
		int R=sc.nextInt();
		int S=sc.nextInt();
		if(P>=35 && Q>=35 && R>=35 && S>=35)
		{
			System.out.println("Student is Pass");
		}
		else
		{
			System.out.println("Fail!!!!!!!!!!!");
		}
	}
}