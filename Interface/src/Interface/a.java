package Interface;
import java.io.File;
public class a {
	public static void main(String args) {
		//file handling concept;
		File f=new File("D:\\folder");
		String[] files=f.list();
		for(String x : files) {
			System.out.println(x);
		}
		System.out.println(files.length);
	}

}
