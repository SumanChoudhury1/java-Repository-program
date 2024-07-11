import java.io.FilterReader;

public class BuffClass {

	public static void main(String[] args) {
		try {
			FilterReader fr=new FilterReader("D//test.text");
			BuffereReader br=new BuffereReader(fr);
			char[] cbuf=new char[20];
			br.read(cbuf);
			for(char c : cbuf) {
				System.out.println(c);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}

}
