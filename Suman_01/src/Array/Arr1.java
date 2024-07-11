package Array;

public class Arr1 {

	public static void main(String[] args) {
		int [] x= {12,54,71,32,28};
		Arr1 a=new Arr1();
		a.test(x);
		System.out.println(x[0]);
		
	}
	
	public void test(int[] y) {
		y[0]=100;
		System.out.println(y[1]);
	}
}
