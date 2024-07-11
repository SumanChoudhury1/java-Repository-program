
public class TypeCast {

	public static void main(String[] args) {
		//Down Casting
		/*float f=10.3F;
		long j=(long)f;
		System.out.println(j);*/
		
	/*/
	long j=10L;
	int i=(int)j;
	System.out.println(i);*/
		TypeCast t=new TypeCast();//use for this keyword
		t.test();
		TypeCast t1=new TypeCast();
		t1.test();
	}
	public void test() {
		System.out.println(this);
	}

}
