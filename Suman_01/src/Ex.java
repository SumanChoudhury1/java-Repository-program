import java.util.*;
public class Ex {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			//int a=sc.nextInt();
			String a=sc.nextLine();
			String s=String.valueOf(a);
			if(PrintPalindrome(s)==true) {
				System.out.println(s+" Is a Palindrome");
			}
			else {
				System.out.println(s+" Not a Palindrome");
			}
		}


	public static boolean PrintPalindrome(String s){
		int left=0;
		int right=s.length()-1;
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				return false;
			}
			left ++;
			right--;
		}
		return true;
		}
	}


