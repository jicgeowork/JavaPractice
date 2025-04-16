package Abstraction;

public abstract class Shape implements Graphics {
	
	public Shape() {
		System.out.println("This is the Abstract class constructor");
	}
	
	public void displayName() {
		System.out.println("This is the non abstract displayName method from abstract class Shape");
	}
	abstract public void displayShape();

}
