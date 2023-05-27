package JavaPrograms;

interface IShape{
	void area();
    void perimeter();
	}
class Circle implements IShape{
	int r = 5;
	double pi=3.14,ar,per;
	
	public void area() {
	  double ar = pi*r*r;
	  System.out.println("area of circle="+ar);
	}
	public void perimeter() {
		double per = 2*pi*r;
		System.out.println("perimeter of circle="+per);
		
	}
}
class Square implements IShape{
	int side = 4;
	double ar,per;
	public void area() {
		double ar = side*side;
		System.out.println("area of square="+ar);
	}
	public void perimeter() {
		double per = 4*side;
		System.out.println("perimeter of square ="+per);
	}
}
class Rectangle implements IShape{
	int len = 5;
	int breadth = 4;
	double ar,per;
	
	public void area() {
		double ar = len*breadth;
		System.out.println("area of Rectangle="+ar);
	}
	public void perimeter() {
		double per = 2*len+breadth;
		System.out.println("perimeter of Rectangle="+per);
	}
}



public class LaunchInterface {

	public static void main(String[] args) {
		IShape Circle = new Circle();
		IShape Square  = new Square();
		IShape Rectangle = new Rectangle();
		    Circle.area();
		    Circle.perimeter();
		    Square.area();
		    Square.perimeter();
		    Rectangle.area();
		    Rectangle.perimeter();
		
		// TODO Auto-generated method stub

	}

}
