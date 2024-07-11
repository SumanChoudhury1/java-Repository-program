
public class GoldClass extends SilverClass{
	
   @Override
   public void chqBook() {
	System.out.println("unlimited /  Years");
  }
   @Override
  public void retofInterest() {
	System.out.println("7.5%");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SilverClass s=new SilverClass();
		s.nlineBanking();
		s.chqBook();
		s.retofInterest();
		System.out.println("___________");
		GoldClass g=new GoldClass();
		s.nlineBanking();
		s.chqBook();
		s.retofInterest();
	}

}
