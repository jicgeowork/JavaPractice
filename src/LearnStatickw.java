
//learn static keyword
public class LearnStatickw {
	
	int i = 0;
	static int j = 0;
	
	public LearnStatickw() {
		i++;
		j++;
		System.out.println("Value of i is " + i);
		System.out.println("Value of j is " + j);
	}
	
	public static void printStatic() {
		System.out.println("This is a static method");
	}
	
	public static void main(String[] args) {
			LearnStatickw ls1 = new LearnStatickw();
			LearnStatickw ls2 = new LearnStatickw();
			LearnStatickw ls3 = new LearnStatickw();
			System.out.println(j);
			printStatic();
			//System.out.println(i); non static variable i , needs object
			//ls2.printStatic();- not recommended as method is static 

	}

}
