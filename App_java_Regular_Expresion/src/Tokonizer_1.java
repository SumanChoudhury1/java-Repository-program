import java.util.StringTokenizer;
public class Tokonizer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count=0;
    StringTokenizer str=new StringTokenizer("12-12-2020","-");
    while(str.hasMoreTokens()) {
    	System.out.println(str.nextToken());
    	count++;
    }
    System.out.println(count++);
	}

}
