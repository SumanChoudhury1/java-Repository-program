import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("[0-9]{10}");
       Matcher m=p.matcher("9686742318");
       while(m.find()) {
    	   System.out.println(m.start()+".."+m.group());
       }
	}

}
