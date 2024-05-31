package sdmcet.cse.oop.intrface;

interface Person{
	void display();
}

class Student implements Person{
	private String name;
	private String mobile;
	private String usn;
	private String branch;
	
	Student(String name,String mobile,String usn,String branch){
		this.name=name;
		this.mobile=mobile;
		this.usn=usn;
		this.branch=branch;
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + name);
		System.out.println("Mobile: " + mobile);
		System.out.println("USN: " + usn);
		System.out.println("Branch: " + branch);
	}
	
}

class Employee implements Person{
	private String name;
	private String mobile;
	private String id;
	private String dept;
	
	Employee(String name,String mobile,String id,String dept){
		this.name=name;
		this.mobile=mobile;
		this.id=id;
		this.dept=dept;
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + name);
		System.out.println("Mobile: " + mobile);
		System.out.println("EmpId: " + id);
		System.out.println("Department : " + dept);
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		p = new Student("xyz","123","2sd22cs","CSE");
		p.display();
		System.out.println();
		
		p = new Employee("abc","456","20ec","ECE");
		p.display();
		
		
	}

}
