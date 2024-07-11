package example_demo;

public class A {

	public static void main(String[] args) {
		int []a= {4,5,8,7,9,6,24};//{4,5,6,7,8,9,24}
		int t=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;i<a.length;i++)
			{
				if(i>j)
				{
					t=i;
					i=j;
					j=t;
				}
			}
		}System.out.println(a[1]);
	}

}
