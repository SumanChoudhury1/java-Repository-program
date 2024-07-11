import java.util.*;
public class invertedpyramids {

	public static void main(String[] args) {
		int n=7;
		for(int i=n; i<=1; i++) {
			for(int j=1; j>=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
