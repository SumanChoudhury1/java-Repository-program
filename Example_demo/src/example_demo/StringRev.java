package example_demo;

public class StringRev {

	public static void main(String[] args) {
		String n = "MUSTAFA CHOUDHURY";
		String r = "";
		for (int i = n.length() - 1; i >= 0; i--) {
			if (i == ' ') {
				continue;
			}
			if (i != ' ') {
				r += n.charAt(i);
			}
		}
		System.out.println(r);
	}
}
