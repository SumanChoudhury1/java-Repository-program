import java.util.*;
public class binarypattern {
public static void main(String args[]) {
	int n=7;
	for(int i=1;i<=n;i++) {
		//inner
		for(int j=1; j<=i; j++) {
			int sum = i+j;
			if(sum % 2 == 0) {
				System.out.print("1 ");//even
			}else {
				System.out.print("0 ");
			}
			
		}
		System.out.println();
	}
}

}
