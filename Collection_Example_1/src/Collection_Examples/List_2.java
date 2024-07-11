package Collection_Examples;

import java.util.LinkedList;

public class List_2 {

	public static void main(String[] args) {
		LinkedList<Integer> x=new LinkedList<Integer>();
		x.addFirst(500000);
		
		x.addLast(2000);
		x.add(5);
		x.add(50);
		x.add(500);
		x.addFirst(200);
		System.out.println(x);

	}

}
