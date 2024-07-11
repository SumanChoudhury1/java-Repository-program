package String;

public class RevString {

	public static void main(String[] args) {
		String s="Alok Kumar";
		String[] a=s.split(" ");
		//String rev="";
		//for(int i=0;i<a.length;i++)
		//{
			//System.out.print(a[i]);
		//}
		//System.out.println("");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
