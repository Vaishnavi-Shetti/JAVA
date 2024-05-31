package sdmcet.cse.oop.Demo;
import sdmcet.cse.oop.person.*;
import sdmcet.cse.oop.employee.*;
import sdmcet.cse.oop.student.*;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		p=new Student("xyz","123","CSE","2sd22cs121");
		p.display();
		System.out.println();
		p=new Employee("abc","456","CS234","ECE");
		p.display();
		
	}

}
