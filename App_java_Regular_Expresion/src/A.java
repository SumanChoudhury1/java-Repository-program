import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class A {

	public static void main(String[] args) {
		Pattern p =Pattern.compile("\\D");
		Matcher m = p.matcher("a6b @#9 D E!");
		while(m.find()) {
			System.out.println(m.start()+"...."+m.group());
		}

	}

}
