package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		
		System.out.println("This is Ktm Bike");
		System.out.println("Cost = 1,00,000");
//		super.cost();
	}

	@Override
	public void speed() {
		
		System.out.println("Speed = 120kmph");
//		super.speed();
	}
	
	public void petro() {
		System.out.println("Petro");
	}

	public void power() {
		System.out.println("power");
	}
//	<<<<<<< HEAD
//=======
//>>>>>>> 90dcb263ba20b2d49d41065eec7e52581151a373

public static void main(String[] args) {
		
		Ktm k = new Ktm();
		k.cost();
		k.speed();
		
	}
}
