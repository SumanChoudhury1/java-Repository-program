
public class Alen {

	public static void main(String[] args) {
		int [] x= {10,20,30,40};
		Alen a1=new Alen();
		a1.test(x);
		System.out.println(x[0]);
	}
	public void test(int[] y) {
	y[0]=100;
	System.out.println(y[0]);
	}
}
