import java.util.Scanner;
public class AddExample {
	public static void reversNumbr(int number) {
		if(number<10) {
			System.out.print(number);
			return;
		}else {
			System.out.print(number%10);
			reversNumbr(number/10);
		}
	}

	public static void main(String[] args) {
	System.out.print("Enter the number");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	System.out.print("the revers of the given number is");
	reversNumbr(number);
	
	
	}
}
		


