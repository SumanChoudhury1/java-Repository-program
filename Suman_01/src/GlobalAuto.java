import java.util.*;
public class GlobalAuto {

	public static void main(String[] args) {
		int input[]= {12,32,13,41,36,87,8};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the valu : ");
		long a=sc.nextLong();
		System.out.println(GlobalAuto.getIndexinArray(input,a));

	}
	public static int getIndexinArray(int[]input,long a) {
		for(int i=0;i<input.length;i++) {
			if(input[i]==a) {
				return i;
			}
		}
		return -1;
	}

}
