package Collection_Examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		List<Integer> x = new LinkedList<Integer>();
		
		
		x.add(10);
		x.add(50);
		x.add(500);
		
		System.out.println("Array size :"+x.size());
		
		System.out.println("Add method() :"+x);
		
		x.add(1, 500);
		
		System.out.println("Add(index, valu) :"+x);
		
		List<Integer> y = new LinkedList<Integer>();
		
		y.add(2000);
		y.add(4000);
		
		x.addAll(2, y);
		
		System.out.println("addAll(index,collection) method() : "+x);
		
		if(x.contains(500)) {
			System.out.println("yes present ");
		}else {
			System.out.println("not present");
		}
		x.remove(3);
		System.out.println("remove index : "+x);
		
		
		System.out.println(x.get(1));
		
		Iterator itr = x.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println("valu of x : "+itr.next());
		}

	}

}
