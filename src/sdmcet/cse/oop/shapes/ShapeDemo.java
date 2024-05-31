package sdmcet.cse.oop.shapes;

interface Shape{
	double computeArea();
	double computePerimeter();
}

class Rectangle implements Shape{
	private int len;
	private int width;
	
	Rectangle(int len,int width){
		this.len=len;
		this.width=width;
	}
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return len*width;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2*(len+width);
	}
	
}

class Circle implements Shape{
	private int radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return 3.142*radius*radius;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2*3.142*radius;
	}
	
}

class Triangle implements Shape{
	 private int a;
	 private int b;
	 private int c;
	 
	 Triangle(int a,int b,int c){
		 this.a=a;
		 this.b=b;
		 this.c=c;
	 }
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		double s = 0.0;
		s = (a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	 
	 
}

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s = new Rectangle(3,4);
		System.out.println("Area of Retangle= " + s.computeArea());
		System.out.println("Perimeter of Rectangle= " + s.computePerimeter() + "\n");
		
		s=new Circle(5);
		System.out.println("Area of Circle= " + s.computeArea());
		System.out.println("Perimeter of Circle= " + s.computePerimeter() + "\n");
		
		s=new Triangle(2,3,4);
		System.out.println("Area of Triangle= " + s.computeArea());
		System.out.println("Perimeter of Triangle= " + s.computePerimeter() + "\n");
		
		
	}

}
