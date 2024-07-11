import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class chsr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("b?");
		Matcher m = p.matcher("aabaaababaaaab");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
     
	}

}
