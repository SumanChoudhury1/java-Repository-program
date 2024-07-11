
public class Break {

	public static void main(String[] args) {
	   label: for(int i=0;i<10;i++) {
			if(i==5) {
				//break;
				continue label;
			}
			System.out.println(i);
		}
       System.out.println("Suman Choudhury");
	}

}
