package sdmcet.cse.oop.student;

import sdmcet.cse.oop.person.*;

 public class Student extends Person{
	 private String branch;
	 private String usn;
	 
	public Student(String name, String mobile,String branch,String usn) {
		super(name, mobile);
		this.branch=branch;
		this.usn=usn;
		// TODO Auto-generated constructor stub
	}
	public void display() {
		super.display();
		System.out.println("Branch: " + branch);
		System.out.println("Usn: " + usn);
		
	}

	
}
