package Collection_Example_List;

import java.util.LinkedList;

public class Emp {

	public static void main(String[] args) {
		
		Employee e1=  new Employee("alok","kumar",1);
		Employee e2= new Employee("suman","choudhury",2);
		Employee e3= new Employee("suhana","parbin",3);
		
		LinkedList<Employee> x=new LinkedList<Employee>();
		
		
		x.add(e1);
		x.add(e2);
		x.add(e3);
		//System.out.println(x);
		
		for(Employee employee :x) {
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getId());
		}

	}

}
