
public class HoloPatterns {
	public static void main(String[] args)
	{
		int n = 10;
    
    //outer loop
    for(int i=1;i<=n;i++) {
    	//inner loop
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
    	}
    	System.out.println( );
    }
    for(int i=n;i>=1;i--) {
    	//inner loop
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
    	}
    	System.out.println( );
    }
	}

}
