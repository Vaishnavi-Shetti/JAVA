package sdmcet.cse.oop.person;

public class Person {

	private String name;
	private String mobile;
	
	protected Person(String name,String mobile) {
		this.name=name;
		this.mobile=mobile;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Mobile: " + mobile);
	}
	
	}
