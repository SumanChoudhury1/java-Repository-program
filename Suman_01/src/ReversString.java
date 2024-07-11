
public class ReversString {

	public static void main(String[] args) {
		String name="sumanchoudhury";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.print("revers of name is : ");
		System.out.print(rev);

	}

}
