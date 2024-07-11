import java.util.*;
public class SwapNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your valu");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before swaping a number"+x+" "+y);
		
		//Swapping logic
		 t=x;
		 x=y;
		y=t;
		System.out.print("After swapping a number"+x+" "+y);
		System.out.println();

	}

}
