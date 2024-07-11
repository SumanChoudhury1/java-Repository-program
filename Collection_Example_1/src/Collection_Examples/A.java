package Collection_Examples;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		
	
		
		ArrayList x=new ArrayList();
		x.add(10);//Auto-Boxing
		x.add(20);
		x.add(new Integer(30));//Auto-Boxing
		x.add("suman");
		x.add(true);
		x.add(10.2);
		

		System.out.println(x);
	}

}
