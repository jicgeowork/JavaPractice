package inheritance;

public class BaseClass {
	
	public BaseClass() {
		System.out.println("Base Class Constructor");
	}
	
	String name="Base class String";
	final String name2 = "Final string from base";
	
	public void printInfofromBase() {
		System.out.println("This is a base class method");
	}
	
	public void printInfofromBase(String str) {
		System.out.println("Method overloading example");
	}
	
}
