
public class ArmstrongNo {

	public static void main(String[] args) {
		int no=370;
		int t1=no;
		int length=0;
		
		while(t1!=0) {
			length=length+1;
			t1=t1/10;
		}
		int t2=no;
		int arm=0;
		while(t2!=0) {
			int mul=1;
			t2=t2%10;
			
		for(int i=1;i<=length;i++) {
			mul=mul*no;
		}
		arm=arm+mul;
		t2=t2/10;
		}
		if(arm==no) {
			System.out.print(no+"No is Armstrong");
		}else {
			System.out.print(no+"No is not Armstrong");
		}
		

	}

}
