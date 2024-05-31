package sdmcet.cse.oop.employee;

import sdmcet.cse.oop.person.*;

 public class Employee extends Person {
	 private String id;
	 private String dept;
	 
	public Employee(String name, String mobile,String id,String dept) {
		super(name, mobile);
		this.id=id;
		this.dept=dept;
		// TODO Auto-generated constructor stub
	}

		public void display() {
			super.display();
			System.out.println("Id: " + id);
			System.out.println("Department: " + dept);
		}
}
