package Abstraction;

public class Circle extends Shape{

	public static void main(String[] args) {
		Circle c= new Circle();
		c.displayName();
		c.displayShape();
		c.corners();
		c.sides();

	}

	@Override
	public void displayShape() {
		System.out.println("This is a circle");
		
	}

	@Override
	public void corners() {
		System.out.println("Implemeting the interface method corners in circle subclass");
		
	}

	@Override
	public void sides() {
		System.out.println("Implemeting the interface method sides in Circle  subclass");
		
	}


}
