
public interface BuffereReader {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("D//test.text");
			BuffereReader br=new BuffereReader(fr);
			char[] cbuf=new char[20];
			br.read(cbuf);
			for(char c:cbuf) {
				System.out.println(c);
			}
		}
	}

	public void read(char[] cbuf);
}
