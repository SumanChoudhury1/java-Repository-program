import java.util.*;
public class inpure {

	public static void main(String[] args) {
		
		int n=8;
		for(int i=1; i<=n; i++) {
			//outer line
			for(int j=1; i<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
