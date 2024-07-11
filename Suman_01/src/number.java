import java.util.*;
public class number {

	public static void main(String[] args) {
		int n=10;
		int number=1;
		//outer loop
		for(int i=1;i<=n;i++) {
			//inner class
			for(int j=1;j<=i;j++) {
				System.out.print(number +" ");
				number++;
			}
			System.out.println();
		}
	}

}
