package inheritance;

public class DerivedClass1 extends BaseClass{
	
		String derivedName = "Derived Class 1 name";
		public DerivedClass1() {
			System.out.println("Derived class constructor");
		}
		
		public void printInfoInDerived() {
			System.out.println("This printing is from derived class method");
			
		}
		
		//Method Overriding - same method in base class
		public void printInfofromBase() {
			System.out.println("printInfofromBase method in derived class - example of method overriding");
		}
		
		public static void main(String[] args) {
			DerivedClass1 dc1 = new DerivedClass1();
			dc1.printInfofromBase();
			dc1.printInfoInDerived();
			System.out.println(dc1.derivedName + " " + dc1.name);
			System.out.println(dc1.name2);
			System.out.println(dc1.name2.concat(" hello")); //String concatenation example.
			dc1.printInfofromBase(" - passed argument"); //Method Overloading example.
			dc1.printInfofromBase();
		}

}
