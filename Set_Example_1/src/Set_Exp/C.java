package Set_Exp;

import java.util.HashMap;
import java.util.Map;
public class C {

	public static void main(String[] args) {
		Map<Integer,String> hm =  new HashMap<>();
		
		hm.put(101, "suman");
		hm.put(102, "suhana");
		hm.put(103, "alok");
		
		System.out.println(hm);
		
		System.out.println(hm.values());
		System.out.println(hm.containsKey(0));
		System.out.println(hm.get(101));
		System.out.println(hm.keySet());

	}

}
