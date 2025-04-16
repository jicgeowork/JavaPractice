package Abstraction;

public class Square extends Shape{

	@Override
	public void displayShape() {
		System.out.println("Shape is Square");
		
	}
	
	public void displayColor() {
		System.out.println("color is yellow");
	}
	
	public static void main(String[] args) {
		Square sq= new Square();
		sq.displayShape();
		sq.displayColor();
		sq.displayName();
		sq.corners();
		sq.sides();
	}

	@Override
	public void corners() {
		System.out.println("Implemeting the interface method corners in square subclass");
		
	}

	@Override
	public void sides() {
		System.out.println("Implemeting the interface method sides in square subclass");
		
	}

}
