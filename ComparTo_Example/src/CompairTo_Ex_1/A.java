package CompairTo_Ex_1;

import java.util.Comparator;

public class A implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	public static void main(String args[]) {
		
		A a1=new A();
		int val=a1.compare(new student(100,"xyz"),new student(200,"abc"));
		System.out.println(val);
		
	}

}
