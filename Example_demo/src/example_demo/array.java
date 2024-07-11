package example_demo;

public class array {

	public static void main(String[] args) {
//		int n=5;
//		int m=5;
//		  for(int i=1;i<=n;i++) {
//			  for(int j=1;j<=m;j++) {
//				  System.out.print("*");
//			  }
//			  System.out.println();
//		  }
		
		//holo-rectangal
		int a=8;
		int b=6;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if(i==1||j==1||i==a||j==b) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}
	}


