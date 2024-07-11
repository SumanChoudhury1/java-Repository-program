
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ap_1 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
	    Matcher m= p.matcher("a6b#@zn9Dc8xFdZ");
	    while(m.find()) {
	    	System.out.println(m.start()+"...."+m.group());
	    }
		}
		
	}


