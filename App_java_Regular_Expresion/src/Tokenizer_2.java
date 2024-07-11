import java.util.StringTokenizer;
public class Tokenizer_2 implements Cloneable {

	public static void main(String[] args) {
		
		Tokenizer_2 T1=new Tokenizer_2();
		
		try {
			Tokenizer_2 T2=(Tokenizer_2)T1.clone();
			System.out.println(T1);
			System.out.println(T2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
