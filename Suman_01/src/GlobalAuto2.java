import java.util.*;
public class GlobalAuto2 {

	public static void main(String[] args) {
	String s="000110011101";
	long as=Long.MAX_VALUE;
    for(int i=0;i<s.length();) {
    	int count=0;
    	if(s.charAt(i)=='0') {
    		while(s.charAt(i)!='1') {
    			count++;
    			i++;
    		}
    		if(count<as)
    			as=count;
    	}
    	i++;
    }
    System.out.println(as);
	}

}
