package Collection_Examples;

import java.util.ArrayList;
import java.util.Iterator;

public class A_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> x = new ArrayList<Integer>();
        
		x.add(10);
		x.add(20);
		x.add(30);
		System.out.println("add method() :" +x);
		x.add(1, 500);
		System.out.println("add(index,valu) method() :"+x);
		
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		y.add(200);
		y.add(500);
		
		x.addAll(2, y);
		System.out.println("addAll(index,Collection) method() :" +x);
		
		if(x.contains(5)) {
			System.out.println("contain is present");
		}else {
			System.out.println("contain is not-present");
		}
		//x.remove(1);
		//System.out.println(" remove index method() : "+x);
		
		System.out.println(y.get(1));
		Iterator itr = x.iterator();
		
		while(itr.hasNext()) {
			System.out.println("valu of x :"+itr.next());
		}
	}

}
