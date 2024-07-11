
public class tree {
	public static int printpower(int x,int n) 
	{
		if(n==0) {
			return 1;
		}
		if(n%2==0) {
			return printpower(x,n/2)*printpower(x,n/2);
		}
		else {
			return x*printpower(x,n/2)*printpower(x,n/2);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=2;
        int n=5;
        int output=printpower(x,n);
        System.out.print(output);
	}

}
