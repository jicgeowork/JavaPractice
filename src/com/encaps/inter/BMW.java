package com.encaps.inter;

//multiple inheritance
public class BMW implements Vehicle, Brand{

	public static void main(String[] args) {
		BMW b1= new BMW();
		b1.mileage();
		b1.speed();
		b1.Honda();
		b1.Ford();

	}
	
	
	@Override
	public void speed() {
		System.out.println("Implementing speed method of Vehicle interface");
		
	}

	@Override
	public void mileage() {
		System.out.println("Implementing mileage method of Vehicle interface");
		
	}

	@Override
	public void Honda() {
		System.out.println("Implementing Honda method of Brand class");
		
		
	}

	@Override
	public void Ford() {
		System.out.println("Implementing Ford method of Brand class");
		
		
	}

}
