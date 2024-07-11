package example_demo;

public class Aa {

	public static void main(String[] args) {
		int []a= {1,5,7,8,6,4,2,3};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min<a[i]) {
				min=a[i];
			}
		}
      System.out.println(min);
	}

}
