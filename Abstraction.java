package abstraction;


abstract class Shape{
	String color;
	abstract double area();
	public abstract String toString();
	
	Shape(String color){
		System.out.println("Shape constructor Called ");
		this.color = color;
	}
	String getColor() {
		return color;
	}
}
class Circle extends Shape{
	
	double radius;
	public Circle(String color , double radius) {
		super(color);
		System.out.println("Circle Cosntructor called");
		this.radius = radius;
	}
	@Override
	double area() {
		
		return Math.PI * Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		
		return "Circle Color is " + super.getColor()+ " Cicle Area is "+ area();
	}
	
}
class Rectangle extends Shape{
	
	double length;
	double breadth;
	
	public Rectangle(String color, double length,double breadth ) {
		super(color);
		System.out.println("Rectangle Constructor Called");
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double area() {
		
		return length*breadth;
	}

	@Override
	public String toString() {
		
		return "Color is "+ super.getColor()+ " Area of a  rectangle "+area() ;
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
			
		Shape c1 = new Circle("Red", 2);
		System.out.println((c1.toString()));
		
		Shape rect = new Rectangle("Yellow", 5,12);
		System.out.println(rect.toString());
	}

}
