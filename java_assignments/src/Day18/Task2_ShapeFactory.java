package Day18;

interface Shape {
	void properties();
}

class Circle implements Shape {

	@Override
	public void properties() {
		System.out.println("Round in shape");
		
	}
	
}

class Square implements Shape {

	@Override
	public void properties() {
		System.out.println("Four sides with equal length and breadth");
		
	}
	
}

class Rectangle implements Shape {

	@Override
	public void properties() {
		System.out.println("Four sides length and breadth");
		
	}
	
}
 
public class Task2_ShapeFactory {
	
	public Shape createShape(String type) {
		if(type.equals("Circle")) {
			return new Circle();
		}
		else if(type.equals("Square")) {
			return new Square();
		}
		else if(type.equals("Rectangle")) {
			return new Rectangle();
		}
		return (Shape) new IllegalArgumentException("Invalid type "+type);
	}
	
	public static void main(String[] args) {
		Task2_ShapeFactory intance = new Task2_ShapeFactory();
		Shape Circle = intance.createShape("Circle");
		Circle.properties();
		
		Shape Square = intance.createShape("Square");
		Square.properties();
		
		Shape Rectangle = intance.createShape("Rectangle");
		Rectangle.properties();
		

	}
}
