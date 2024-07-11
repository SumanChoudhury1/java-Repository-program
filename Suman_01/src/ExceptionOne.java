
public class ExceptionOne {

	public static void main(String[] args) {
		int a=100/0;
		try {
			System.out.print(a);
		}catch(Exception e){
			System.out.print(e);
		}
		System.out.print("Rest the code....?");

	}

}
