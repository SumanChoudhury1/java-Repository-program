
public class Email {

		public void SendEmail(String tci,String Emailid) {
			System.out.println("transactional email id ");
		}
		
		public void SendEmail(String Emailid) {
			System.out.println("promotional email id ");
		}
		public static void main(String[] args) {
			Email e=new Email();
			e.SendEmail("112sad","suhana@123gmail.com");
			e.SendEmail("sc123@gmail.com");
	}

}
