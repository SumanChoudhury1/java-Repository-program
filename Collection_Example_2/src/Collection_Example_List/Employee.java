package Collection_Example_List;

public class Employee {
	
	private String FirstName;
	private String LastName;
	private int id;
	
	
	Employee(String FirstName,String LastName,int id){
		
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.id=id;
	}
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
