package example_demo;

 class cont {
	
	private int id;
	private String Fname;
	private String Lname;
	private int Mnumber;
	
	public cont(){
		id =01;
		Fname="suman";
		Lname="Choudhury";
		Mnumber=12365;	
	}
	
	public cont(int id,String Fname, String Lname,int Mnumber) {
		this();
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return Fname;
	}

	public String getLname() {
		return Lname;
	}

	public int getMnumber() {
		return Mnumber;
	}
	
}
class demo{
	
	public static void main(String[] args) {
		
		cont c = new cont (1,"Suhana","madhu", 125478);
		System.out.println(c.getId());
		System.out.println(c.getFname());
		System.out.println(c.getLname());
		System.out.println(c.getMnumber());

}
	
}
	
